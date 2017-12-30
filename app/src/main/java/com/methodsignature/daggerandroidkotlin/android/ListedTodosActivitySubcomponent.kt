package com.methodsignature.daggerandroidkotlin.android

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface ListedTodosActivitySubcomponent: AndroidInjector<ListedTodoActivity> {

    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<ListedTodoActivity>()
}
