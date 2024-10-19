package com.example.smeb9716.utils

import android.app.Application

class BrainApp: Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: BrainApp
            private set
    }
}