package com.jawahir.learndagger.service

import com.jawahir.learndagger.data.UserRepository
import com.jawahir.learndagger.di.SQLRepositoryAnnotation
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    @Named("sms") private val notificationService: NotificationService,
    @SQLRepositoryAnnotation private val userRepository: UserRepository
) {
    fun registerService(email:String, password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,password,"this is dagger message")
    }
}