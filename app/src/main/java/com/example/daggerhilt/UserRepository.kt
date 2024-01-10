package com.example.daggerhilt

import android.util.Log

const val TAG = "SahilSapehia"
class UserRepository {

    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in DB")
    }
}