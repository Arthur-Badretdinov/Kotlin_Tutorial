package com.example.myapp1

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp1.databinding.ActivityTest1Binding
import com.example.myapp1.databinding.ActivityTest2Binding

class testActivity2 : AppCompatActivity() {
    lateinit var bindingClass : ActivityTest2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.bTest1.setOnClickListener {
            val name : String = bindingClass.edTest1.text.toString()
            when(name) {
                "Артур", "Динар", "Глеб", "Регина" -> {
                    bindingClass.tvTest2.visibility = View.VISIBLE
                    bindingClass.tvTest2.text = "Оценка: 5"
                }
                "Леонид", "Александр", "Тимур", "Азат" -> {
                    bindingClass.tvTest2.visibility = View.VISIBLE
                    bindingClass.tvTest2.text = "Оценка: 4"
                }
                "Диана", "Александра", "Кирилл" -> {
                    bindingClass.tvTest2.visibility = View.VISIBLE
                    bindingClass.tvTest2.text = "Оценка: 3"
                }
                "Нугзар", "Эдуард", "Владимир" -> {
                    bindingClass.tvTest2.visibility = View.VISIBLE
                    bindingClass.tvTest2.text = "Оценка: 2"
                }
                "Никита" -> {
                    bindingClass.tvTest2.visibility = View.VISIBLE
                    bindingClass.tvTest2.text = "Оценка: 1"
                }
                else -> {
                    bindingClass.tvTest2.visibility = View.VISIBLE
                    bindingClass.tvTest2.text = "Данного ученика нет в базе данных"
                }
            }
        }
    }
}