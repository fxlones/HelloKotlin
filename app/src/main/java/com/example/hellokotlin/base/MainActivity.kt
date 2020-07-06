package com.example.hellokotlin.base

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.hellokotlin.R
import com.example.hellokotlin.util.DensityUtil
import com.example.hellokotlin.util.ToastUtil
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created on 2020/06/28.
 * @author FanXl
 * Description : 主Activity
 */
class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        initView()
    }

    private fun initView() {
        val textSize: String = DensityUtil.dip2px(this, 20f).toString();
        tv_hello_kotlin?.setTextSize(textSize.toFloat())
        tv_hello_kotlin?.setText(R.string.hello_kotlin)
        ToastUtil.get().showShortToast(this, TAG + "initView")
        Toast.makeText(this, textSize + tv_hello_kotlin?.textSize, Toast.LENGTH_SHORT).show()
    }

    override fun getLyoutIt(): Int {
        return R.layout.activity_main
    }


}
