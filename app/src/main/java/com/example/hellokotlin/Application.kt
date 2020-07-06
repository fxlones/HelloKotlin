package com.example.hellokotlin

import android.app.Application

/**
 * Created on 2020/06/30.
 * @author FanXl
 * Description :
 */
class Application : Application() {
     val application: com.example.hellokotlin.Application = com.example.hellokotlin.Application();

    override fun onCreate() {
        super.onCreate()

    }
}