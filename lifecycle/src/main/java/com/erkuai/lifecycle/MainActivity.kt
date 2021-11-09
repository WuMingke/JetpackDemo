package com.erkuai.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.erkuai.lifecycle.normal_class.MyLocationListener
import com.erkuai.lifecycle.service.MyService

class MainActivity : AppCompatActivity() {

    private var locationListener: MyLocationListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        locationListener = MyLocationListener(this, object : MyLocationListener.OnLocationChangedListener {
            override fun onChanged(latitude: Double, longitude: Double) {

            }
        })

        locationListener?.let {
            lifecycle.addObserver(it)
        }

    }

    fun start(view: View) {
        val intent = Intent(this, MyService::class.java)
        startService(intent)
    }

    fun end(view: View) {
        stopService(Intent(this, MyService::class.java))
    }
}