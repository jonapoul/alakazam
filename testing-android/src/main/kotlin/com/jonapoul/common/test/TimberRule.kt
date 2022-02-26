package com.jonapoul.common.test

import net.lachlanmckee.timberjunit.TimberTestRule
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class TimberRule : TestRule {
    private val delegate = TimberTestRule.logAllAlways()

    override fun apply(base: Statement?, description: Description?): Statement {
        return delegate.apply(base, description)
    }
}
