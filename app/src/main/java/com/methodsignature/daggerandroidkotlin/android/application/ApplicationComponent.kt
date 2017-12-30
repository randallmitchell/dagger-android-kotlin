package com.methodsignature.daggerandroidkotlin.android.application

import com.methodsignature.daggerandroidkotlin.android.ListedTodosActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class, ListedTodosActivityModule::class])
interface ApplicationComponent {
    fun inject(application: Application)
}
