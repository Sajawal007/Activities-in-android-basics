package com.example.bookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class F : AppCompatActivity() {
    lateinit var next_btn: Button
    lateinit var back_btn: Button
    lateinit var txtView: TextView
    lateinit var phrase: TextView
    lateinit var imgView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f)
        next_btn = findViewById(R.id.button)
        back_btn =findViewById(R.id.back)
        txtView = findViewById(R.id.page_no)
        phrase = findViewById(R.id.phrase)
        imgView = findViewById(R.id.img_)
        imgView.setImageResource(R.drawable.pg)
        txtView.setText("F")
        phrase.setText("F for Fat")
        next_btn.setOnClickListener {
            val nxtPage: Intent = Intent(this,G::class.java)
            startActivity(nxtPage)
        }
        back_btn.setOnClickListener {
            finish()
        }
    }
}