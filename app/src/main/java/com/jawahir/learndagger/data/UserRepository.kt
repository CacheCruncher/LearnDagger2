package com.jawahir.learndagger.data

import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String, password:String)
}

class SQLRepository @Inject constructor():UserRepository {
    override fun saveUser(email:String, password:String){
        println("save user in SQL with $email, $password")
    }
}

class FirebaseRepository ():UserRepository {
    override fun saveUser(email:String, password:String){
        println("save user in Firebase with $email, $password")
    }
}