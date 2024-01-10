package com.example.daggerhilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
abstract class UserModule {

    @Provides
    @Named("firebase")
    fun provideUserRepository(): UserRepository {
        return FirebaseRepository()
    }

    @Provides
    @Named("sql")
    fun provideSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    //So here we have used @Binds annotation because here the function is taking sqlRepository
    //as the parameter and returning it and Hilt knows how to create its object because in
    //SQLRepository class @Inject annotation is used.
    @Binds
    abstract fun bindUserRepository(sqlRepository: SQLRepository): UserRepository
}