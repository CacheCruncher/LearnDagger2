package com.jawahir.learndagger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.jawahir.learndagger.di.DaggerUserRegistrationComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val dagerBuild = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService =
            dagerBuild.getRegistrationComponent()
        val emailService = dagerBuild.getEmailServiceComponent()
        emailService.sendEmail()
        userRegistrationService.registerService()
    }
}