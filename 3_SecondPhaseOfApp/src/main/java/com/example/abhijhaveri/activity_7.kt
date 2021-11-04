package com.example.abhijhaveri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.github.barteksc.pdfviewer.PDFView

class activity_7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7)

        val pdfview : PDFView = findViewById(R.id.PDFView)
        pdfview.fromAsset("abhiresume.pdf")
            .enableSwipe(true)
            .swipeHorizontal( true)
            .load()

    }
}