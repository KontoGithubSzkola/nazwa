package com.example.nazwa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var i = 0
        val show = findViewById<Button>(R.id.button)
        val obrazek = findViewById<ImageView>(R.id.obraz)
        show.setOnClickListener {
            if(i == 0)
            {
                ImageView.setImageResource(R.drawable.obraz)
                
                i = 1

            }
            else
            {
                ImageView.setImageResource(R.drawable.brak)
                i = 0
            }
        }
    }
}