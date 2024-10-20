package com.example.smeb9716.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.smeb9716.foundation.BaseViewModel
import com.example.smeb9716.model.ErrorMessage
import com.example.smeb9716.model.request.LoginRequest
import com.example.smeb9716.model.response.LoginResponse
import kotlinx.coroutines.launch

class LoginViewModel(application: Application) : BaseViewModel(application) {
    companion object {
        private val TAG = LoginViewModel::class.java.simpleName
    }

    private val _loginResponse = MutableLiveData<LoginResponse>()
    val loginResponse: LiveData<LoginResponse> = _loginResponse

    fun login(loginRequest: LoginRequest) {
        viewModelScope.launch {
            try {
                val response = apiRepository.login(loginRequest)
                response.let {
                    // Handle success response
                    _loginResponse.postValue(response)
                }
            } catch (e: Exception) {
                error.postValue(ErrorMessage(e.message))
            }
        }
    }
}