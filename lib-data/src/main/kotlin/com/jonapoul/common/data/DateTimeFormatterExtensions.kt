package com.jonapoul.common.data

import org.threeten.bp.ZoneId
import org.threeten.bp.format.DateTimeFormatter
import java.util.Locale

fun DateTimeFormatter.localised(): DateTimeFormatter =
    withZone(ZoneId.systemDefault())
        .withLocale(Locale.getDefault())
