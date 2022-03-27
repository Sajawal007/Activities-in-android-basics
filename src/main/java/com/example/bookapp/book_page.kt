package com.example.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class book_page : AppCompatActivity() {

    var title: Char = 'A'
    var imgID= listOf(R.drawable.pg,R.drawable.logo)
    var listOfPhrases = listOf(
        "B for Button",
        "C for CustomAdapter",
        "D for Drawables",
        "E for England",
        "F for England",
        "G for GEEE",
        "H for Hollywood",
        "I for Intern",
        "J for Hollywood",
        "K for Hollywood",
        "L for Hollywood",
        "M for Hollywood",
        "N for Hollywood",
        "O for Hollywood",
        "P for Hollywood",
        "Q for Hollywood",
        "R for Hollywood",
        "S for Hollywood",
        "T for Hollywood",
        "U for Hollywood","V for Hollywood","W for Hollywood","X for Hollywood","Y for Hollywood","Z for ZOOOOP!!!"
    )

    lateinit var next_btn:Button
    lateinit var back_btn:Button
    lateinit var txtView: TextView
    lateinit var phrase: TextView
    lateinit var imgView: ImageView

    var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_page)
        next_btn = findViewById(R.id.button)
        back_btn =findViewById(R.id.back)
        txtView = findViewById(R.id.page_no)
        phrase = findViewById(R.id.phrase)
        imgView = findViewById(R.id.img_)
        imgView.setImageResource(imgID[1])
        next_btn.setOnClickListener {
            if(count < 25) {
                title += 1
                txtView.setText("$title")
                phrase.setText(listOfPhrases[count])
                imgView.setImageResource(imgID[0])
                count+=1
            }
            else
            {
                //next_btn.setVisibility(View.INVISIBLE)
                Toast.makeText(this, "No more pages!!", Toast.LENGTH_SHORT).show()
            }
        }
        back_btn.setOnClickListener {
            if(count >= 1){
                count-=1
                title -= 1
                txtView.setText("$title")
                phrase.setText(listOfPhrases[count])
                imgView.setImageResource(imgID[0])
            }
            else if(count == 0)
            {
                finish()
            }
        }
    }
}