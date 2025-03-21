package com.jawahir.learndagger.service

import com.jawahir.learndagger.di.scope.ActivityScope
import com.jawahir.learndagger.di.scope.ApplicationScope
import javax.inject.Inject

interface NotificationService{
    fun send(from:String, to:String, body:String)
}

class EmailService @Inject constructor():NotificationService{
    override fun send(from:String, to:String, body:String){
        println("send email: $from, $to, $body")
    }
}

@ActivityScope
class SmsService (private val retry:Int):NotificationService{
    override fun send(from:String, to:String, body:String){
        println("send sms: $from, $to, $body,  retry: $retry")
    }
}
