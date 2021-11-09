package com.erkuai.lifecycle.normal_class

import android.app.Activity
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

// 组件与页面隔离
class MyLocationListener(context: Activity, var listener: OnLocationChangedListener) : LifecycleObserver {

    init {
        initLocationManager()
    }

    // 初始化
    private fun initLocationManager() {
        Log.i("LOCATION", "initLocationManager: ")
    }

    // 业务开始
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun startGetLocation() {
        Log.i("LOCATION", "startGetLocation: ")

//        listener?.onChanged()
    }

    // 业务结束
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private fun stopGetLocation() {
        Log.i("LOCATION", "stopGetLocation: ")
    }

    interface OnLocationChangedListener {
        fun onChanged(latitude: Double, longitude: Double)
    }
}