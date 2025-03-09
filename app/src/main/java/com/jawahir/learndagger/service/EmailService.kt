package com.jawahir.learndagger.service

import javax.inject.Inject

interface NotificationService{
    fun send(from:String, to:String, body:String)
}

class EmailService @Inject constructor():NotificationService{
    override fun send(from:String, to:String, body:String){
        println("send email: $from, $to, $body")
    }
}

class SmsService ():NotificationService{
    override fun send(from:String, to:String, body:String){
        println("send sms: $from, $to, $body")
    }
}
