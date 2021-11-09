package com.erkuai.lifecycle.service

import androidx.lifecycle.LifecycleService

class MyService : LifecycleService() {

    init {
        val serviceObserver = MyServiceObserver()
        lifecycle.addObserver(serviceObserver)
    }
}