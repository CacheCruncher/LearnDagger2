package com.jawahir.learndagger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.jawahir.learndagger.service.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val appComponent = (application as MyApplication).appComponent
        val userRegistrationComponent =
            appComponent
                .getUserRegistrationComponentBuilder()
                .retryCount(3)
                .build()

        userRegistrationComponent.inject(this)
        userRegistrationService.registerService("abultabul@gmail.com", "abultablu")
    }
}