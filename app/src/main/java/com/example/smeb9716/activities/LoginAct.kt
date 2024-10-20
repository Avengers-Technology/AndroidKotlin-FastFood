package com.example.smeb9716.activities

import android.content.Intent
import androidx.activity.viewModels
import com.example.smeb9716.MainActivity
import com.example.smeb9716.databinding.ActLoginBinding
import com.example.smeb9716.foundation.BaseActivity
import com.example.smeb9716.viewmodel.LoginViewModel

class LoginAct : BaseActivity<ActLoginBinding>() {
    companion object {
        private const val TAG = "LoginAct"
    }

    private val loginViewModel: LoginViewModel by viewModels()

    override fun getViewBinding(): ActLoginBinding {
        return ActLoginBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        
    }

    override fun initEvents() {
        binding.btnLogin.setOnClickListener { handleLogin() }
        binding.tvSignUp.setOnClickListener { handleRegister() }
    }

    override fun initObservers() {}

    private fun handleLogin() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun handleRegister() {
        val intent = Intent(this, RegisterAct::class.java)
        startActivity(intent)
    }
}
