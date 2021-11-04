package com.example.abhijhaveri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button =  findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent ( this, Activity3::class.java)
            startActivity(intent)
        }

        val button2 =  findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent = Intent ( this, Activity2::class.java)
            startActivity(intent)
        }

        val button4 =  findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            val intent = Intent ( this, Activity4::class.java)
            startActivity(intent)
        }
        val button11 =  findViewById<Button>(R.id.button11)
        button11.setOnClickListener{
            val intent = Intent ( this, activity_7::class.java)
            startActivity(intent)
        }
    }
}