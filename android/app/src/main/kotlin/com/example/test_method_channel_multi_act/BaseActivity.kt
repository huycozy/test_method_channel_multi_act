package com.example.test_method_channel_multi_act

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.plugin.common.MethodChannel

abstract class BaseActivity: FlutterActivity() {
//    private val CHANNEL = "com.example.ble_poc/channel"
//
//    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
//        super.configureFlutterEngine(flutterEngine)
//        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler {
//                call, result ->
//            if(call.method.equals("goToSecondActivity")){
//                Log.d("TAG", "main")
//                goToSecondActivity()
//                result.success(true)
//            } else if (call.method.equals("updatePosition")) {
//                Log.d("TAG", "second")
//                updatePosition()
//            }
//            else {
//                Log.d("TAG", "failed")
//                result.notImplemented()
//            }
//        }
//    }
//
//
//    private fun goToSecondActivity() {
//        startActivity(Intent(this@BaseActivity, SecondActivity::class.java))
//    }
//
//    private fun updatePosition() {
//        startActivity(Intent(this@BaseActivity, MainActivity::class.java))
//    }
}