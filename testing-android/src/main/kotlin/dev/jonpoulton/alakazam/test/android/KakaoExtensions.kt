package dev.jonpoulton.alakazam.test.android

import io.github.kakaocup.kakao.common.matchers.PositionMatcher
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.childrenIndexed(onEach: (Int, T) -> Unit) {
  for (i in 0 until getSize()) {
    childAtIndexed(i, onEach)
  }
}

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.childAtIndexed(position: Int, onEach: (Int, T) -> Unit) {
  val provideItem = itemTypes
    .getOrElse(T::class) { error("${T::class.java.simpleName} did not register the KRecyclerView") }
    .provideItem

  try {
    scrollTo(position)
  } catch (_: Throwable) {
  }

  val item = provideItem.invoke(PositionMatcher(matcher, position)) as T
  onEach.invoke(position, item)
}
