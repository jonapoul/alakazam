package com.jonapoul.common.domain.usecase

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest

abstract class ObservableUseCase<Output> {
    private val trigger = MutableStateFlow(true)

    @OptIn(ExperimentalCoroutinesApi::class)
    val flow: Flow<Output> = trigger.flatMapLatest { fetchData() }

    suspend fun launch() {
        trigger.emit(!trigger.value)
    }

    protected abstract fun fetchData(): Flow<Output>
}
