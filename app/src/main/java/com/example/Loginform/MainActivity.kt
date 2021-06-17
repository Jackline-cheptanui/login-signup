package com.example.Loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnsignup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnsignup = findViewById<Button>(R.id.btnsignform)
        btnsignup.setOnClickListener {
            val intent=Intent(baseContext,signupform::class.java)
            startActivity(intent)

        }

    }


        }





