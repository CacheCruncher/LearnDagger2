package com.jawahir.learndagger.service

import com.jawahir.learndagger.data.UserRepository
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val notificationService: NotificationService,
    private val userRepository: UserRepository
) {
    fun registerService(email:String, password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,password,"this is dagger message")
    }
}