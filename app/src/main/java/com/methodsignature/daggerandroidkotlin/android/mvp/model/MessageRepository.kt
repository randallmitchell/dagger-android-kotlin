package com.methodsignature.daggerandroidkotlin.android.mvp.model

interface MessageRepository {
    fun getMessage(): Message
}

class HardCodedMessageRepository: MessageRepository {
    override fun getMessage() = Message("Hello World!")
}