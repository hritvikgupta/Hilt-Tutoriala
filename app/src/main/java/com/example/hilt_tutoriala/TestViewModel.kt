package com.example.hilt_tutoriala

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Named

class TestViewModel @Inject constructor(
    @Named("String1") textString1:String
):ViewModel() {
    init {
        Log.d("View Model Inject", "Text String from ViewModel:$textString1")

    }
}