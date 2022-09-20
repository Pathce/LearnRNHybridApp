package com.learnrnhybridapp.ktModules

import android.os.Build
import android.os.Handler
import android.os.Looper
import androidx.annotation.RequiresApi
import com.facebook.react.bridge.*
import java.text.SimpleDateFormat
import java.util.*

import com.facebook.react.bridge.ReactMethod
import com.facebook.react.modules.core.DeviceEventManagerModule
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class sampleModule(context: ReactApplicationContext) : ReactContextBaseJavaModule() {

    private val _mainHandler = Handler(Looper.getMainLooper())
    private val rContext: ReactApplicationContext = context
    var secondCount = 0

    @RequiresApi(Build.VERSION_CODES.O)
    @ReactMethod
    fun getCurrentTime(promise: Promise) {
        val date = ZonedDateTime.now( ZoneOffset.UTC ).format( DateTimeFormatter.ISO_INSTANT )
        promise.resolve(date)
    }

    @ReactMethod
    fun addListener(eventName: String?) {
        //
    }

    @ReactMethod
    fun dispatchEventEverySecond() {
        //
    }

    override fun getName(): String {
        return "Clock"
    }
}