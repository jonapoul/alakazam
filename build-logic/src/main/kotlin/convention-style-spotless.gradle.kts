plugins {
  id("com.diffplug.spotless")
}

spotless {
  format("misc") {
    target("*.gradle", "*.gitignore", "*.pro")
    indentWithSpaces()
    trimTrailingWhitespace()
    endWithNewline()
  }
  freshmark {
    target("*.md")
  }
  json {
    target("*.json")
    simple()
  }
  yaml {
    target("*.yml", "*.yaml")
    jackson()
  }
}
