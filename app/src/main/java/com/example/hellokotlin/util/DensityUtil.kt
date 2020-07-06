package com.example.hellokotlin.util

import android.content.Context
import android.util.DisplayMetrics
import android.view.Window
import android.view.WindowManager

/**
 * Created on 2020/06/30.
 * @author FanXl
 * Description :
 */
open class DensityUtil() {
    companion object {
        /**
         * 根据手机的分辨率从dp的单位转换为px(像素)
         * @param context 上下文
         * @param dpValue 想要设置的dp值
         */

        fun dip2px(context: Context, dpValue: Float): Int {
            //获取当前手机的像素密度
            val scale: Float = context.resources.displayMetrics.density
            return (dpValue * scale + 0.5f).toInt()
        }

        /**
         * 根据手机的分辨率从px的单位转换为dp
         */

        fun px2dip(context: Context, pxValue: Float): Int {
            val scale: Float = context.resources.displayMetrics.density;
            return (pxValue / scale + 0.5f).toInt()
        }

        /**
         * 获取屏幕宽度
         * @param Context 上下文
         * @return Int 屏幕宽度
         */
        fun getScreenWidth(context: Context): Int {
            //从系统服务中获取窗口管理器
            val wm =
                context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val dm = DisplayMetrics()
            wm.defaultDisplay.getMetrics(dm)
            return dm.widthPixels
        }

        /**
         * 获取当前屏幕的宽度
         * @param context 上下文
         * @return Int 屏幕高度
         */
        fun getScreenHeight(context: Context): Int {
            //从系统服务中获取窗口管理器
            val wm =
                context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val dm = DisplayMetrics()
            //从默认显示器中获取显示参数保存到dm对象中
            wm.defaultDisplay.getMetrics(dm)
            //返回屏幕的高度数值
            return dm.heightPixels
        }

        fun getScreenDensity(context: Context): Float {
            //从系统服务中获取窗口管理器
            val wm =
                context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val dm = DisplayMetrics()
            //从默认显示器中获取前世参数保存到dm对象中
            wm.defaultDisplay.getMetrics(dm)
            //返回屏幕的像素密度值
            return dm.density;
        }
    }


}