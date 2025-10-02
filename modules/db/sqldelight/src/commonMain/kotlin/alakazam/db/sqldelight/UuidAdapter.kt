/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.db.sqldelight

import app.cash.sqldelight.ColumnAdapter
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@ExperimentalUuidApi
public data object UuidAdapter : ColumnAdapter<Uuid, String> by stringAdapter(Uuid::parse)
