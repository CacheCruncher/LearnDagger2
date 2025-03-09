package com.jawahir.learndagger.di

import com.jawahir.learndagger.MainActivity
import dagger.Component

@Component(modules = [UserRegistrationModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
}