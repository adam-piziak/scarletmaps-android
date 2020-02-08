package com.example.scarletmaps.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.example.scarletmaps.R
import com.example.scarletmaps.ui.home.HomeFragment
import com.google.android.gms.location.FusedLocationProviderClient

class MainActivity : AppCompatActivity() {

    private lateinit var fusedLocationClient: FusedLocationProviderClient

    private lateinit var cont: FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.container,
                    HomeFragment()
                )
                .commit()
        }
    }
}
