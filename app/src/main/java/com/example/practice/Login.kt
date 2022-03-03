package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var bundleX:Bundle? = this.intent.extras
        var textV:TextView = findViewById(R.id.value)

        textV.text = "Hola ${bundleX?.getString("value")}"
    }
}