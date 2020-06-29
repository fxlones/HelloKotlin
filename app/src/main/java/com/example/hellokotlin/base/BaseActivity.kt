package com.example.hellokotlin.base

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Logger

/**
 * Created on 2020/06/28.
 * @author FanXl
 * Description : Activity基类
 */
open class BaseActivity : AppCompatActivity() {
    val TAG = this::class.java.simpleName;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

}