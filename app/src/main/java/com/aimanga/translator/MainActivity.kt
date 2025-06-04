package com.aimanga.translator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val translateButton = findViewById<Button>(R.id.translateButton)
        translateButton.setOnClickListener {
            Toast.makeText(this, "OCR + Translate initiated!", Toast.LENGTH_SHORT).show()
            // Start OCR and translation pipeline here
        }
    }
}
