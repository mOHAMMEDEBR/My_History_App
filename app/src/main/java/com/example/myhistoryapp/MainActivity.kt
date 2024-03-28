package com.example.myhistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    lateinit var txtdisage: TextView
    lateinit var buttonmm: Button
    lateinit var buttonclear: Button


    var ageInput: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ageInput = findViewById(R.id.edtageinput)
        buttonmm = findViewById(R.id.btnmatchme)
        buttonclear = findViewById(R.id.btnclear)
        txtdisage = findViewById(R.id.textdispage)



        buttonmm.setOnClickListener{
            val age = ageInput


        }

        buttonclear.setOnClickListener{
            ageInput = null;
        }
    }
}