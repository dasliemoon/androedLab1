package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.myapplication.databinding.ActivityMainBinding


class  MainActivity : AppCompatActivity() {
    private lateinit var bindingClass : ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.showButton.setOnClickListener() {

            if (bindingClass.showButton.text == "Отобразить") {
                bindingClass.showButton.text = "Скрыть"
                bindingClass.textView.isVisible = true
            }
            else {
                bindingClass.showButton.text = "Отобразить"
                bindingClass.textView.isVisible = false
            }
        }
    }
}
