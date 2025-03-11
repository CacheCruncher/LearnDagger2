package com.jawahir.learndagger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.jawahir.learndagger.di.DaggerUserRegistrationComponent
import com.jawahir.learndagger.service.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val daggerBuild = DaggerUserRegistrationComponent.builder().build()
        daggerBuild.inject(this)
        userRegistrationService.registerService("abultabul@gmail.com", "abultablu")
    }
}