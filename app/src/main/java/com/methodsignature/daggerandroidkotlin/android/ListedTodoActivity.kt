package com.methodsignature.daggerandroidkotlin.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.methodsignature.daggerandroidkotlin.R
import com.methodsignature.daggerandroidkotlin.android.mvp.presenter.MessagePresenter
import com.methodsignature.daggerandroidkotlin.android.mvp.view.MessageView
import dagger.android.AndroidInjection
import javax.inject.Inject

class ListedTodoActivity : AppCompatActivity() {

    lateinit var mvpMessageView: MessageView

    @Inject
    lateinit var mvpMessagePresenter: MessagePresenter

    @Target(AnnotationTarget.FUNCTION)
    @Retention(AnnotationRetention.RUNTIME)
    @MustBeDocumented
    annotation class MvpMessageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listed_todo_activity_layout)

        val messageView: View = findViewById(R.id.listed_todo_activity_message_view)
        if (messageView is MessageView) {
            mvpMessageView = messageView
        }

        AndroidInjection.inject(this)
    }

    @MvpMessageView
    fun getMessageView(): MessageView {
        return mvpMessageView
    }

    override fun onStart() {
        super.onStart()
        mvpMessagePresenter.startPresenting()
    }
}
