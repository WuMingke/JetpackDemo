package com.erkuai.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
}