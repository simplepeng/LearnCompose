package me.simple.compose

import android.app.Application
import android.widget.Toast

class App : Application() {

    companion object {
        private var mApp: App? = null

        fun toast(msg: String) {
            Toast.makeText(mApp!!, msg, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate() {
        super.onCreate()
        mApp = this
    }
}