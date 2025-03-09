package com.jawahir.learndagger.di

import com.jawahir.learndagger.data.SQLRepository
import com.jawahir.learndagger.data.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserRegistrationModule {
    @Provides
    fun getSQLRepository(): UserRepository {
        return SQLRepository()
    }
}