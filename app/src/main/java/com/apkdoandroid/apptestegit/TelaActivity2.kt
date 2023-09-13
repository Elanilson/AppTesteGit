package com.apkdoandroid.apptestegit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        println("Mensagem para você")
        println("modificado")

    }
}