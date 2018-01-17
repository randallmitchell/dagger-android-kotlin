package com.methodsignature.daggerandroidkotlin.android

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = [MessageActivitySubcomponent::class])
abstract class MessageActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MessageActivity::class)
    abstract fun bindListedTodosActivityInjectorFactory(builder: MessageActivitySubcomponent.Builder):
            AndroidInjector.Factory<out Activity>
}
