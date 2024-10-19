package com.example.smeb9716.foundation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.smeb9716.foundation.api.ApiRepository
import com.example.smeb9716.model.ErrorMessage

open class BaseViewModel(application: Application): AndroidViewModel(application) {

    companion object {
        private val TAG = BaseViewModel::class.java.simpleName
    }

    val apiRepository = ApiRepository()

    val error = MutableLiveData<ErrorMessage>()

}