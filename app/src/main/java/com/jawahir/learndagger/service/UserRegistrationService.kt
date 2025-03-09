package com.jawahir.learndagger.service

import com.jawahir.learndagger.data.UserRepository
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val emailService: EmailService,
    private val userRepository: UserRepository
) {
    fun registerService(){
        userRepository.saveUser("abultabul@gmail.com","abultabul")
        emailService.sendEmail()
    }
}