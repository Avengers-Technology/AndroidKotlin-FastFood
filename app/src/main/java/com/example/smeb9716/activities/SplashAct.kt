package com.example.smeb9716.activities

import android.content.Intent
import android.os.Handler
import android.os.Looper
import com.example.smeb9716.databinding.ActSplashBinding
import com.example.smeb9716.foundation.BaseActivity

class SplashAct : BaseActivity<ActSplashBinding>() {
    companion object {
        private const val SPLASH_DELAY = 5000L
    }

    override fun getViewBinding(): ActSplashBinding {
        return ActSplashBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        // No views to initialize for now
    }

    override fun initEvents() {
        try {
            Handler(Looper.getMainLooper()).postDelayed({
                openMainScreen()
            }, SPLASH_DELAY)
        } catch (e: Exception) {
            openMainScreen()
        }
    }

    override fun initObservers() {
        // No observers to initialize for now
    }

    private fun openMainScreen() {
        val intent = Intent(this, LoginAct::class.java)
        startActivity(intent)
        finish()
    }
}
