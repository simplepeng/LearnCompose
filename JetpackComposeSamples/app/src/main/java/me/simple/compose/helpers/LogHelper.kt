package me.simple.compose.helpers

import android.util.Log

object LogHelper {

    private const val TAG = "JetpackComposeSample"

    fun debug(text: String) {
        Log.d(TAG, text)
    }
}