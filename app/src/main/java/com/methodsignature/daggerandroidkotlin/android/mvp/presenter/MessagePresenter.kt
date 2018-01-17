package com.methodsignature.daggerandroidkotlin.android.mvp.presenter

import com.methodsignature.daggerandroidkotlin.android.mvp.model.MessageRepository
import com.methodsignature.daggerandroidkotlin.android.mvp.view.MessageView

interface MessagePresenter {
    fun startPresenting()
}

class DefaultMessagePresenter(val view: MessageView, val repo: MessageRepository): MessagePresenter {
    override fun startPresenting() {
        view.showMessage(repo.getMessage().text)
    }
}
