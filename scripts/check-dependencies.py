from pathlib import Path
import re
import subprocess


class Dependency:
    def __init__(self, string: str):
        parts = string.strip().split(":")
        if len(parts) != 3:
            raise ValueError(
                f"Expected three colon-separated elements in {string}, got {parts}"
            )
        self.group = parts[0]
        self.artifact = parts[1]
        self.version = parts[2]

    def __str__(self) -> str:
        return f"{self.group}:{self.artifact}:{self.version}"

    def __repr__(self) -> str:
        return str(self)

    def __eq__(self, value: object) -> bool:
        if not isinstance(value, Dependency):
            return False
        return (
            self.group == value.group
            and self.artifact == value.artifact
            and self.version == value.version
        )


def readOutput(root: Path, cmd: list[str]) -> list[str]:
    process = subprocess.run(cmd, capture_output=True, text=True, cwd=str(root))
    return process.stdout.splitlines()


def rootDir() -> Path:
    return Path(__file__).resolve().parent.parent


def extractRegexOrNone(text: str, pattern: str) -> str | None:
    match = re.search(pattern, text)
    if match:
        return match.group(1)
    else:
        return None


def readDependencyRestrictions(root: Path) -> list[Dependency]:
    dependencies = []
    file = root / "dependency-restrictions.txt"
    with open(str(file), "r") as f:
        for line in f.readlines():
            if line:
                if line.strip().startswith("#"):
                    print(f"Ignoring commented-out restriction: {line}")
                else:
                    dependencies.append(Dependency(line))
    return dependencies


def readModules(root: Path) -> list[str]:
    output = readOutput(root, ["./gradlew", "-q", "projects"])
    modules = []
    for line in output:
        if "---" not in line:
            continue
        moduleName = extractRegexOrNone(line, r"Project '(.*)'")
        if moduleName is not None:
            modules.append(moduleName)
    return modules


def readModuleDependencies(module: str, root: Path) -> list[Dependency]:
    # raw output
    output = readOutput(
        root,
        ["./gradlew", "-q", "projects", "--console", "plain", f"{module}:dependencies"],
    )

    # list of dependencies
    dependencies = []
    pattern = r"\-\-\- ([\w\d\-\.]+:[\w\d\-\.]+:[\d\.\-\w]+)"
    for line in output:
        match = extractRegexOrNone(line, pattern)
        if match is not None:
            dependencies.append(Dependency(match))

    # remove duplicated
    unique_dependencies = []
    for dep in dependencies:
        if dep not in unique_dependencies:
            unique_dependencies.append(dep)

    # sorted alphabetically
    return sorted(unique_dependencies, key=lambda dep: str(dep))


def dependenciesAreValid(
    module: str, dependencies: list[Dependency], restrictions: list[Dependency]
) -> bool:
    invalid_deps = []
    for restriction in restrictions:
        matches = [
            d
            for d in dependencies
            if d.group == restriction.group and d.artifact == restriction.artifact
        ]
        for match in matches:
            if match.version > restriction.version:
                invalid_deps.append(match)

    if len(invalid_deps) > 0:
        print(f"Found invalid dependencies in {module}: {invalid_deps}")
        return False
    else:
        print(f"No problems in {module}")
        return True


def main():
    root = rootDir()
    restrictions = readDependencyRestrictions(root)
    print(f"Found restrictions: {restrictions}")
    modules = readModules(root)
    print(f"Checking modules: {modules}")
    allValid = True

    for module in modules:
        dependencies = readModuleDependencies(module, root)
        moduleIsValid = dependenciesAreValid(module, dependencies, restrictions)
        allValid = allValid and moduleIsValid

    if allValid:
        print("No problems found!")
        exit(0)
    else:
        print("Found at least one problem - check logs for more info")
        exit(1)


if __name__ == "__main__":
    main()
