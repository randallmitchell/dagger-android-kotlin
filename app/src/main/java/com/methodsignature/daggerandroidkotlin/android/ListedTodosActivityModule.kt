package com.methodsignature.daggerandroidkotlin.android

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = [ListedTodosActivitySubcomponent::class])
abstract class ListedTodosActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(ListedTodoActivity::class)
    abstract fun bindListedTodosActivityInjectorFactory(builder: ListedTodosActivitySubcomponent.Builder):
            AndroidInjector.Factory<out Activity>
}
