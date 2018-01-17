package com.methodsignature.daggerandroidkotlin.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.methodsignature.daggerandroidkotlin.R
import com.methodsignature.daggerandroidkotlin.android.mvp.presenter.MessagePresenter
import com.methodsignature.daggerandroidkotlin.android.mvp.view.MessageView
import dagger.android.AndroidInjection
import javax.inject.Inject

class MessageActivity : AppCompatActivity() {

    lateinit var messageView: MessageView

    @Inject
    lateinit var messagePresenter: MessagePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_activity_layout)

        val messageView: View = findViewById(R.id.message_activity_message_view)

        when (messageView) {
            is MessageView -> this.messageView = messageView
            else -> throw IllegalStateException("Message view must exist within layout.")
        }

        AndroidInjection.inject(this)
    }

    override fun onStart() {
        super.onStart()
        messagePresenter.startPresenting()
    }
}
