package com.example.daggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication: Application() {

    //This is known as field Injection
    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()

        userRepository.saveUser("sahilsapehia49@gmail.com", "1234")

    }
}