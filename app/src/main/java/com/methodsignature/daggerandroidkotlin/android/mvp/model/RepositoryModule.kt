package com.methodsignature.daggerandroidkotlin.android.mvp.model

import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(): MessageRepository {
        return HardCodedMessageRepository()
    }
}