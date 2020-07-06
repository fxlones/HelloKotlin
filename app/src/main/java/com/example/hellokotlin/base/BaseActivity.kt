package com.example.hellokotlin.base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Logger

/**
 * Created on 2020/06/28.
 * @author FanXl
 * Description : Activity基类
 */
open abstract class BaseActivity : AppCompatActivity() {
    val TAG = this::class.java.simpleName
    lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this;
        setContentView(getLyoutIt())
    }

    abstract fun getLyoutIt(): Int


}