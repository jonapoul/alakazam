/**
 * Copyright © 2025 Jon Poulton
 * SPDX-License-Identifier: Apache-2.0
 */
@file:Suppress("warnings", "ALL")

package alakazam.kotlin.core

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

public interface ResettableStateFlow<T> : MutableStateFlow<T> {
  public fun reset()
}

public fun <T> ResettableStateFlow(value: T): ResettableStateFlow<T> = ResettableStateFlowImpl(value)

private class ResettableStateFlowImpl<T>(
  private val initialValue: T,
) : ResettableStateFlow<T>, MutableStateFlow<T> by MutableStateFlow(initialValue) {
  override fun reset() = update { initialValue }
}
