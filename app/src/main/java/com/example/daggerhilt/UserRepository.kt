package com.example.daggerhilt

import android.util.Log
import javax.inject.Inject

const val TAG = "SahilSapehia"

 //This is constructor injection because here the UserRepository class depends upon the loggerService
 // and loggerService is passed in the constructor of the class
class UserRepository @Inject constructor(val loggerService: LoggerService) {

    fun saveUser(email: String, password: String) {
        loggerService.log("User saved in DB")
    }
}