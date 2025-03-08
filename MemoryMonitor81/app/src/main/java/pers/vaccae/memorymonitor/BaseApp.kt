package pers.vaccae.memorymonitor

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        mContext = this

        Monitor.init(mContext!!)
    }


    companion object {
        @JvmField
        @SuppressLint("StaticFieldLeak")
        var mContext: Context? = null
    }
}