package com.example.abhijhaveri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)

        val button9 =  findViewById<Button>(R.id.button9)
        button9.setOnClickListener{
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}