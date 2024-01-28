import com.diffplug.spotless.extra.wtp.EclipseWtpFormatterStep

plugins {
  id("com.diffplug.spotless")
}

spotless {
  format("xml") {
    target("*.xml")
    eclipseWtp(EclipseWtpFormatterStep.XML)
  }
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
