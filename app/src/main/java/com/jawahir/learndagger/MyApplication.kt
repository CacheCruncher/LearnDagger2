package com.jawahir.learndagger

import android.app.Application
import com.jawahir.learndagger.di.DaggerUserRegistrationComponent
import com.jawahir.learndagger.di.UserRegistrationComponent

class MyApplication:Application() {
    lateinit var daggerBuild: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
        daggerBuild =
            DaggerUserRegistrationComponent.factory().create(3)

    }
}