package com.example.test_method_channel_multi_act

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.plugin.common.MethodChannel

class MainActivity: FlutterActivity() {
    private val CHANNEL = "com.example.ble_poc/channel"

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler {
                call, result ->
            if(call.method.equals("goToSecondActivity")){
                Log.d("TAG", "main")
                goToSecondActivity()
                result.success(true)
            }
            else {
                Log.d("TAG", "main failed")
                result.notImplemented()
            }
        }
    }


    private fun goToSecondActivity() {
        startActivity(Intent(this@MainActivity, SecondActivity::class.java))
    }
}