package com.methodsignature.daggerandroidkotlin.android.mvp.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import com.methodsignature.daggerandroidkotlin.R

interface MessageView {
    fun showMessage(message: String)
}

class DefaultMessageView: MessageView, FrameLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    var textView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.message_view, this, true)
        textView = findViewById(R.id.message_view_text)
    }

    override fun showMessage(message: String) {
        textView.text = message
    }
}