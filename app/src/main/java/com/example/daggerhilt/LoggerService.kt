package com.example.daggerhilt

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoggerService @Inject constructor() {

    fun log(message: String) {
        Log.d(TAG, message)
    }
}