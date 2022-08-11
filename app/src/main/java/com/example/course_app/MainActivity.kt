package com.example.course_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<CardView>(R.id.cardView1).setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))

        findViewById<CardView>(R.id.cardView8).setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
        }

        }
    }
}