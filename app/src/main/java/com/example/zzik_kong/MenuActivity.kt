package com.example.zzik_kong

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController

class MenuActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


    }

    override fun onPause() {
        super.onPause()
        var TAG = "MenuActivity : "
        Log.v(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        var TAG = "MenuActivity : "
        Log.v(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        var TAG = "MenuActivity : "
        Log.v(TAG, "onDestroy")
    }

    override fun onStart() {
        super.onStart()
        var TAG = "MenuActivity : "
        Log.v(TAG, "onStart")
    }
}