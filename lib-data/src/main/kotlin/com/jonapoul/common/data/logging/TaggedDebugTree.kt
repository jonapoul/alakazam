package com.jonapoul.common.data.logging

import timber.log.Timber

abstract class TaggedDebugTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String {
        return "(${element.fileName}:${element.lineNumber})#${element.methodName}"
    }
}
