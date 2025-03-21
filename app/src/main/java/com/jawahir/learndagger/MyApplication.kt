package com.jawahir.learndagger

import android.app.Application
import com.jawahir.learndagger.di.AppComponent
import com.jawahir.learndagger.di.DaggerAppComponent

class MyApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent =
            DaggerAppComponent.builder().build()

    }
}