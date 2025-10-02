/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
package alakazam.test.logging

public actual fun Thread.getThreadId(): Long = threadId()
