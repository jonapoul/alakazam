import app.cash.licensee.UnusedAction

plugins {
  id("app.cash.licensee")
}

licensee {
  unusedAction(UnusedAction.IGNORE)

  allow(spdxId = "Apache-2.0") // Most libraries
  allow(spdxId = "MIT") // Some other libraries
  allow(spdxId = "BSD-3-Clause") // Hamcrest, Protobuf
  allow(spdxId = "BSD-2-Clause") // Hamcrest
  allow(spdxId = "EPL-1.0") // JUnit

  allowUrl(url = "http://www.opensource.org/licenses/bsd-license.php") // Hamcrest, BSD-2-Clause
  allowUrl(url = "https://github.com/mockito/mockito/blob/master/LICENSE") // MIT
}
