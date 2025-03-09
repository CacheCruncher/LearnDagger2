package com.jawahir.learndagger.di

import com.jawahir.learndagger.MainActivity
import dagger.Component

@Component
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
}