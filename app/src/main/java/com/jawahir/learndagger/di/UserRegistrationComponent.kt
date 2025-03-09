package com.jawahir.learndagger.di

import com.jawahir.learndagger.service.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getRegistrationComponent():UserRegistrationService
}