package com.example.abhijhaveri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class Activity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6)

        val button10 =  findViewById<Button>(R.id.button10)
        button10.setOnClickListener{
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}