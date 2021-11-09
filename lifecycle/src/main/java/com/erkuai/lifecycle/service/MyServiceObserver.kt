package com.erkuai.lifecycle.service

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyServiceObserver : LifecycleObserver {

    // 业务开始
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun startGetLocation() {
        Log.i("SERVICE_LOCATION", "startGetLocation: ")

//        listener?.onChanged()
    }

    // 业务结束
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private fun stopGetLocation() {
        Log.i("SERVICE_LOCATION", "stopGetLocation: ")
    }
}