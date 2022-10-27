package club.kentmb.activitytest

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity :AppCompatActivity(){
    /*
    * 让baseactivity作为其他activity的父类，同时该类继承自appCompatActivity，可以方便地打印出当前界面是哪一个activity
    * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity",javaClass.simpleName)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeActivity(this)
    }
}