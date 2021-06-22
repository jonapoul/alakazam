---
title: setLifecycleAwareAdapter -
---
//[library](../../index.md)/[com.jonapoul.extensions](index.md)/[setLifecycleAwareAdapter](set-lifecycle-aware-adapter.md)



# setLifecycleAwareAdapter  
[androidJvm]  
Content  
fun <[VH](set-lifecycle-aware-adapter.md) : [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html)> [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html).[setLifecycleAwareAdapter](set-lifecycle-aware-adapter.md)(lifecycleAdapter: [RecyclerView.Adapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html)<[VH](set-lifecycle-aware-adapter.md)>)  
More info  


Automatically clears the [RecyclerView.Adapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html) instance from your [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html) when the host view is destroyed. This means you can remove a bunch of Fragment.onDestroyView boilerplate, just by using this instead of [RecyclerView.setAdapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html#setadapter).

  



