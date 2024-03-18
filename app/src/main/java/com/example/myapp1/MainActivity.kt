package com.example.myapp1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp1.databinding.ActivityMainBinding
import com.example.myapp1.databinding.ActivityTest1Binding

class MainActivity : AppCompatActivity() {
    var counter = 0
    lateinit var tvTest : TextView
    lateinit var bTest : Button

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
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