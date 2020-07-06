package com.example.hellokotlin.util

import android.content.Context
import android.widget.Toast

/**
 * Created on 2020/06/28.
 * @author FanXl
 * Description : 吐司工具类
 */
open class ToastUtil private constructor() {
    //实现不管我们触发多少次Toast调用，都只会持续一次Toast显示的时长
    //companion object{} 相当于static  其内部的内容都是静态的换言之就是说 其它类可以调用这些竖行
    companion object {
        private var instence: ToastUtil? = null
            get() {
                if (field == null) {
                    field = ToastUtil()
                }
                return field
            }

        fun get(): ToastUtil {
            //!! 表示如果instence 为空时会抛出异常
            return instence!!
        }
    }

    open fun showShortToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    open fun showLongToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()

    }


}