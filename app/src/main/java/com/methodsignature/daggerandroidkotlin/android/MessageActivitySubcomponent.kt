package com.methodsignature.daggerandroidkotlin.android

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [MessageActivityModule::class, MessageActivityModule::class])
interface MessageActivitySubcomponent : AndroidInjector<MessageActivity> {

    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MessageActivity>()
}
