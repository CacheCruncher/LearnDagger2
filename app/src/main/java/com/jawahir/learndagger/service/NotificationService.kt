package com.jawahir.learndagger.service

import com.jawahir.learndagger.di.ApplicationScope
import javax.inject.Inject

interface NotificationService{
    fun send(from:String, to:String, body:String)
}

class EmailService @Inject constructor():NotificationService{
    override fun send(from:String, to:String, body:String){
        println("send email: $from, $to, $body")
    }
}

@ApplicationScope
class SmsService (private val retry:Int):NotificationService{
    override fun send(from:String, to:String, body:String){
        println("send sms: $from, $to, $body,  retry: $retry")
    }
}
