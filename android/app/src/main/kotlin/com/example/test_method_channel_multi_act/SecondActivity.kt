package com.example.test_method_channel_multi_act

import android.content.Context
import android.os.Bundle
import android.util.Log
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.plugin.common.MethodChannel
import android.content.Intent

class SecondActivity: FlutterActivity() {
    private val CHANNEL = "com.example.ble_poc/map_channel"

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler {
                call, result ->
            if (call.method.equals("updatePosition")) {
                Log.d("TAG", "second")
                val lat = call.argument<Double>("lat")
                val long = call.argument<Double>("long")
                val accuracy = call.argument<Double>("accuracy") ?: 7.170562529369844
                val floorLevel = call.argument<Int>("floor") ?: 0
//                updatePosition(lat!!, long!!, accuracy, floorLevel)
                updatePosition()
            } else {
                Log.d("TAG", "second failed")
                result.notImplemented()
            }
        }
    }

    private fun updatePosition() {
        startActivity(Intent(this@SecondActivity, MainActivity::class.java))
    }


}