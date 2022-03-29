package com.example.bookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Z : AppCompatActivity() {
    lateinit var next_btn: Button
    lateinit var back_btn: Button
    lateinit var txtView: TextView
    lateinit var phrase: TextView
    lateinit var imgView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_z)
        next_btn = findViewById(R.id.button)
        back_btn =findViewById(R.id.back)
        txtView = findViewById(R.id.page_no)
        phrase = findViewById(R.id.phrase)
        imgView = findViewById(R.id.img_)
        imgView.setImageResource(R.drawable.pg)
        next_btn.setText("Finish!")
        txtView.setText("Z")
        phrase.setText("Z for Zoooohh!")
        next_btn.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            // set the new task and clear flags
            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(i)
        }
        back_btn.setOnClickListener {
            finish()
        }
    }
}