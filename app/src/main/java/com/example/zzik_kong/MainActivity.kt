package com.example.zzik_kong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController


    }

    override fun onPause() {
        super.onPause()
        var TAG = "MyActivity : "
        Log.v(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        var TAG = "MyActivity : "
        Log.v(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        var TAG = "MyActivity : "
        Log.v(TAG, "onDestroy")
    }

    override fun onStart() {
        super.onStart()
        var TAG = "MyActivity : "
        Log.v(TAG, "onStart")
    }
}