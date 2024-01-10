package com.example.daggerhilt

import android.util.Log
import javax.inject.Inject

const val TAG = "SahilSapehia"

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor(): UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in DB")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in firebase")
    }

}