package com.jonapoul.alakazam.time

import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Locale

val DateTimeFormatter.localised: DateTimeFormatter
    get() = withZone(ZoneId.systemDefault())
        .withLocale(Locale.getDefault())

val String.localisedFormatter: DateTimeFormatter
    get() = DateTimeFormatter.ofPattern(this).localised
