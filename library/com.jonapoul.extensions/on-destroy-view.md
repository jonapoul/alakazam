---
title: onDestroyView -
---
//[library](../../index.md)/[com.jonapoul.extensions](index.md)/[onDestroyView](on-destroy-view.md)



# onDestroyView  
[androidJvm]  
Content  
fun <[V](on-destroy-view.md) : [View](https://developer.android.com/reference/kotlin/android/view/View.html)> [V](on-destroy-view.md).[onDestroyView](on-destroy-view.md)(callback: [V](on-destroy-view.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Registers a callback to be run when the view is detached from the window. This is useful because ViewBinding objects can't be accessed in the Fragment.onDestroyView method. This means that without this method we'd be blocked from doing certain cleanup tasks in onDestroyView - such as removing the adapter from a RecyclerView.

  



