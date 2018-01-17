package com.methodsignature.daggerandroidkotlin.android

import com.methodsignature.daggerandroidkotlin.android.mvp.model.MessageRepository
import com.methodsignature.daggerandroidkotlin.android.mvp.presenter.DefaultMessagePresenter
import com.methodsignature.daggerandroidkotlin.android.mvp.presenter.MessagePresenter
import com.methodsignature.daggerandroidkotlin.android.mvp.view.MessageView
import dagger.Module
import dagger.Provides

@Module
class MessageActivityModule {

    @Provides
    fun provideMessagePresenter(view: MessageView, repo: MessageRepository): MessagePresenter {
        return DefaultMessagePresenter(view, repo)
    }

    @Provides
    fun provideMessageView(activity: MessageActivity): MessageView {
        return activity.messageView
    }
}
