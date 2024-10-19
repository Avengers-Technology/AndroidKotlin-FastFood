package com.example.smeb9716.activities

import com.example.smeb9716.databinding.ActRegisterBinding
import com.example.smeb9716.foundation.BaseActivity

class RegisterAct : BaseActivity<ActRegisterBinding>() {
    companion object {
        private const val TAG = "RegisterAct"
    }

    override fun getViewBinding(): ActRegisterBinding {
        return ActRegisterBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        // No views to initialize for now
    }

    override fun initEvents() {
        // No events to initialize for now
    }

    override fun initObservers() {
        // No observers to initialize for now
    }
}