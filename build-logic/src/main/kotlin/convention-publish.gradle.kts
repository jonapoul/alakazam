plugins {
  id("com.vanniktech.maven.publish")
  id("org.jetbrains.dokka")
}

afterEvaluate {
  // Attach the dokka task to build afterwards, since the build task doesn't exist right now.
  tasks.getByName("build").dependsOn("dokkaHtml")
}
