package com.example.android_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val beginButton = findViewById<Button>(R.id.btn_begin)
        val questionsNum = findViewById<AppCompatEditText>(R.id.questions_num)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        beginButton.setOnClickListener{
            if(questionsNum.text.toString().isEmpty()){
                Toast.makeText(this, "Wprowadź liczbę pytań", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this,QuestionsView::class.java )
                startActivity(intent)
                finish()
            }
        }

    }
}