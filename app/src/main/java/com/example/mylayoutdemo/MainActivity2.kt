package com.example.mylayoutdemo

import android.content.Context
import android.content.Context.MODE_APPEND
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ParcelFileDescriptor.MODE_APPEND

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


    }

    fun SharedPreferences.Editor.modify() {

    }
}