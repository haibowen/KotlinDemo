package com.example.mylayoutdemo

import android.annotation.SuppressLint
import android.content.Context
import android.content.Context.MODE_APPEND
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ParcelFileDescriptor.MODE_APPEND
import android.provider.Settings.Global.putFloat
import androidx.core.content.edit

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        getPreferences(Context.MODE_PRIVATE).edit {
            putFloat("aaa", 10f)
            putBoolean("bbb", true)
        }

        getPreferences(Context.MODE_PRIVATE).modify {
            putFloat("aaa", 10f)
            putBoolean("bbb", true)
        }


    }

    fun SharedPreferences.modify(block: SharedPreferences.Editor.() -> Unit) {

        val editor = edit()
        editor.block()
        editor.apply()

    }
}