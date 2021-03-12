package com.kxf.fataartest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kxf.libmain.UtilMain

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.w("MainActivity", "" + UtilMain.getInfo())
    }
}