package com.example.abhijhaveri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val button6 =  findViewById<Button>(R.id.button6)
        button6.setOnClickListener{
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}