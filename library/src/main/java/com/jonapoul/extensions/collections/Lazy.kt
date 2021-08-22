package com.jonapoul.extensions.collections

fun <DataType> lazyListOf(vararg elements: DataType): Lazy<List<DataType>> =
    LazyCollection { elements.asList() }

fun <DataType> lazyMutableListOf(vararg elements: DataType): Lazy<MutableList<DataType>> =
    LazyCollection { elements.asList().toMutableList() }

internal class LazyCollection<DataType, CollectionType : Collection<DataType>>(
    private val factory: () -> CollectionType
) : Lazy<CollectionType> {
    private var cached: CollectionType? = null

    override val value: CollectionType
        get() = cached ?: factory.invoke().also { cached = it }

    override fun isInitialized(): Boolean = cached != null
}
