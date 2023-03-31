package com.example.hilt_tutoriala

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainModule     {
    @ActivityScoped  //create only single instance and does not create every time new instrance of this string
    @Provides//we want to provide this string as a dependency
    @Named("String1")
    fun provideTextString(@ApplicationContext context:Context
    ,@Named("String2") textString2:String)  = "${context.getString(R.string.string_to_inject)} - $textString2"

//    @Singleton  //create only single instance and does not create every time new instrance of this string
//    @Provides//we want to provide this string as a dependency
//    @Named("String2")
//    fun provideTextString2()  = "This is string will be inject as well"
//

}