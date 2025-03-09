package com.jawahir.learndagger.data

import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email:String, password:String){
        println("save user with $email, $password")
    }
}