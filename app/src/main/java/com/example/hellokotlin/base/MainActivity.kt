package com.example.hellokotlin.base

import android.os.Bundle
import android.util.Log
import com.example.hellokotlin.R

/**
 * Created on 2020/06/28.
 * @author FanXl
 * Description : 主Activity
 */
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG , "onCreate")

    }
}
