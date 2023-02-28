package com.jonapoul.common.logging

import timber.log.Timber

abstract class TaggedDebugTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String =
        "(${element.fileName}:${element.lineNumber})#${element.methodName}"
}
