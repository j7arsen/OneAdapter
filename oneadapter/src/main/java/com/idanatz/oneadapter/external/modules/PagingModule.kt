package com.idanatz.oneadapter.external.modules

import com.idanatz.oneadapter.external.interfaces.*
import com.idanatz.oneadapter.internal.holders.Metadata
import org.jetbrains.annotations.NotNull
import com.idanatz.oneadapter.internal.holders.ViewBinder

abstract class PagingModule :
        LayoutModuleConfigurable<PagingModuleConfig>,
        Creatable, Bindable, Unbindable
{

    // lifecycle
    override fun onCreated(@NotNull viewBinder: ViewBinder) {}
    override fun onBind(@NotNull viewBinder: ViewBinder, @NotNull metadata: Metadata) {}
    override fun onUnbind(@NotNull viewBinder: ViewBinder, @NotNull metadata: Metadata) {}

    // functionality
    abstract fun onLoadMore(currentPage: Int)
}

abstract class PagingModuleConfig : LayoutModuleConfig {
    abstract fun withVisibleThreshold() : Int
}