package com.example.smeb9716.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.smeb9716.foundation.BaseViewModel
import com.example.smeb9716.model.ErrorMessage
import com.example.smeb9716.model.User
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : BaseViewModel(application) {
    companion object {
        private val TAG = UserViewModel::class.java.simpleName
    }

    private val _users = MutableLiveData<List<User>?>()
    val users: LiveData<List<User>?> = _users


    fun getUsers() {
        viewModelScope.launch {
            try {
                val response = apiRepository.getUsers()
                response.let {
                    _users.postValue(response)
                }
            } catch (e: Exception) {
                // Handle error
                Log.e(TAG, "Error fetching users", e)
                error.postValue(ErrorMessage(e.message))
            }
        }
    }

}