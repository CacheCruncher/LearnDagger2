package com.jawahir.learndagger.di

import com.jawahir.learndagger.data.FirebaseRepository
import com.jawahir.learndagger.data.SQLRepository
import com.jawahir.learndagger.data.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRegistrationModule {
    @SQLRepositoryAnnotation
    @Provides
    fun getSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    @Named("firebase")
    @Provides
    fun getFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

}