package com.example.smeb9716.activities

import android.util.Log
import com.example.smeb9716.R
import com.example.smeb9716.databinding.ActNotificationBinding
import com.example.smeb9716.foundation.BaseActivity

class NotificationAct : BaseActivity<ActNotificationBinding>() {
    companion object {
        private const val TAG = "NotificationAct"
    }

    override fun getViewBinding(): ActNotificationBinding {
        return ActNotificationBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        binding.header.titleHeader.text = getString(R.string.notification)
    }

    override fun initEvents() {
        binding.header.imvBack.setOnClickListener {
            try {
                finish()
            } catch (e: Exception) {
                Log.e(TAG, "initEvents: ", e)
            }
        }
    }

    override fun initObservers() {
        // No observers to initialize for now
    }
}
