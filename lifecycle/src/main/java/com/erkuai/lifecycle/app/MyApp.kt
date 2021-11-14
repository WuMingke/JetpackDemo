package com.erkuai.lifecycle.app

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        ProcessLifecycleOwner.get().lifecycle.addObserver(AppObserver())
    }
}