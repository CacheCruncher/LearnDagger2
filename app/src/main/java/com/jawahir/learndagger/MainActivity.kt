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

        val userRegistrationService =
            DaggerUserRegistrationComponent.builder().build().getRegistrationComponent()
        userRegistrationService.registerService()
    }
}