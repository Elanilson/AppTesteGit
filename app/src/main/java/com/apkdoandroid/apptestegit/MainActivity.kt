package com.apkdoandroid.apptestegit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Mensagem")
        println("Mensagem 2")
        println("Modificado 4")
    }
}