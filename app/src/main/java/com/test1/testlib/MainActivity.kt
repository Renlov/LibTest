package com.test1.testlib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test1.toasttest.toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("aaaa")
    }
}