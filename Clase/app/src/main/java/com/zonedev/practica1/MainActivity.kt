package com.zonedev.practica1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var leftNumber = (0..100).random()
        var rightNumber = (0..100).random()


        var txtText = findViewById<TextView>(R.id.myText)
        var button_left = findViewById<Button>(R.id.btn_left)
        var button_right = findViewById<Button>(R.id.btn_right)

        button_left.setOnClickListener{
            button_right.text = rightNumber.toString()
            button_left.text = leftNumber.toString()
           if(leftNumber>rightNumber){
               txtText.text = "You won"

           }else{
               txtText.text = "You Lost"
           }
            leftNumber = (0..100).random()
            rightNumber = (0..100).random()

        }
        button_right.setOnClickListener{
            button_right.text = rightNumber.toString()
            button_left.text = leftNumber.toString()
            if(leftNumber<rightNumber){
                txtText.text = "You won"
            }else{
                txtText.text = "You Lost"
            }
            leftNumber = (0..100).random()
            rightNumber = (0..100).random()
        }

    }
}