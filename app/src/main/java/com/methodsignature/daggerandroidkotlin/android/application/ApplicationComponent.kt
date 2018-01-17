package com.methodsignature.daggerandroidkotlin.android.application

import com.methodsignature.daggerandroidkotlin.android.MessageActivityBindingModule
import com.methodsignature.daggerandroidkotlin.android.mvp.model.RepositoryModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class,
    MessageActivityBindingModule::class,
    RepositoryModule::class
])
interface ApplicationComponent {
    fun inject(application: Application)
}
