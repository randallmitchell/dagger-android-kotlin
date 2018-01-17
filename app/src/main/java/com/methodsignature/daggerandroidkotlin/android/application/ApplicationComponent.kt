package com.methodsignature.daggerandroidkotlin.android.application

import com.methodsignature.daggerandroidkotlin.android.ListedTodosActivityBindingModule
import com.methodsignature.daggerandroidkotlin.android.mvp.model.RepositoryModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class,
    ListedTodosActivityBindingModule::class,
    RepositoryModule::class
])
interface ApplicationComponent {
    fun inject(application: Application)
}
