package com.example.hilt_tutoriala

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule     {
//    @Singleton  //create only single instance and does not create every time new instrance of this string
//    @Provides//we want to provide this string as a dependency
//    @Named("String1")
//    fun provideTextString()  = "This is string to inject"

    @Singleton  //create only single instance and does not create every time new instrance of this string
    @Provides//we want to provide this string as a dependency
    @Named("String2")
    fun provideTextString2()  = "This is string will be inject as well"


}