package com.example.abhijhaveri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val button3 =  findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}