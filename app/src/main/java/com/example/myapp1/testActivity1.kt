package com.example.myapp1

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp1.databinding.ActivityTest1Binding

class testActivity1 : AppCompatActivity() {
    lateinit var bindingClass : ActivityTest1Binding
    val a = 6
    val b = 2
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.bAdd.setOnClickListener {
            val result = a + b
            bindingClass.tvResult.text = "$a+$b=$result"
        }

        bindingClass.bSub.setOnClickListener {
            val result = a - b
            bindingClass.tvResult.text = "$a-$b=$result"
        }

        bindingClass.bMul.setOnClickListener {
            val result = a * b
            bindingClass.tvResult.text = "$a*$b=$result"
        }

        bindingClass.bDiv.setOnClickListener {
            val result = a / b
            bindingClass.tvResult.text = "$a/$b=$result"
        }
    }
}