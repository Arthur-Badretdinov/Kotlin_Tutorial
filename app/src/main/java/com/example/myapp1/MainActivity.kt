package com.example.myapp1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var counter = 0
    lateinit var tvTest : TextView
    lateinit var bTest : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTest = findViewById(R.id.tvTest1)
        bTest = findViewById(R.id.buttonTest1)

        tvTest.text = counter.toString()
        bTest.setOnClickListener {
            onClickTest()
        }
    }

    fun onClickTest(){
        counter = counter + 1
        tvTest.text = counter.toString()
    }
}