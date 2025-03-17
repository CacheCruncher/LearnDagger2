package com.jawahir.learndagger.service

import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(from:String, to:String, body:String)
}

class EmailService @Inject constructor():NotificationService{
    override fun send(from:String, to:String, body:String){
        println("send email: $from, $to, $body")
    }
}

@Singleton
class SmsService (private val retry:Int):NotificationService{
    override fun send(from:String, to:String, body:String){
        println("send sms: $from, $to, $body,  retry: $retry")
    }
}
