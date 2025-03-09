package com.jawahir.learndagger.service

import javax.inject.Inject

class EmailService @Inject constructor(){
    fun sendEmail(){
        println("send email")
    }
}