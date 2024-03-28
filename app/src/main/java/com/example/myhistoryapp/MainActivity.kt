package com.example.myhistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var txtdisage: TextView
    private lateinit var buttonmm: Button
    private lateinit var buttonclear: Button

    private var ageInput: EditText? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ageInput = findViewById(R.id.edtageinput)
        buttonmm = findViewById(R.id.btnmatchme)
        buttonclear = findViewById(R.id.btnclear)
        txtdisage = findViewById(R.id.textdispage)



        buttonmm.setOnClickListener {
            val age = ageInput?.text.toString()
            txtdisage.text = age

            when (age) {
                "39" -> {
                    txtdisage.text = "cleopatra (39) - Last active ruler of the Ptolemaic Kingdom of Egypt."
                }
                "55" -> {
                    txtdisage.text = "Julius Caesar (55) - Roman general and statesman who played a critical role in the events that led to the demise of the Roman Republic"
                }
                "19" -> {
                    txtdisage.text = "Joan of Arc (19) - French heroine and military leader during the Hundred Years' War."

                }
                "67" -> {
                    txtdisage.text = "Leonardo da Vinci (67) - Italian polymath known for his contributions to art, science, and engineering."
                }
                "81" -> {
                    txtdisage.text = "Queen Victoria (81) - Queen of the United Kingdom of Great Britain and Ireland from 1837 to 1901."
                }
                "65" -> {
                    txtdisage.text = " Genghis Khan (65) - Founder and first Great Khan of the Mongol Empire, the largest contiguous empire in history"
                }
                "88" -> {
                    txtdisage.text = "Michelangelo (88) - Italian sculptor, painter, architect, and poet of the High Renaissance."
                }
                "32" -> {
                    txtdisage.text = "Anne Boleyn (35) - Queen of England from 1533 to 1536 as the second wife of King Henry VII"
                }
                "34" -> {
                    txtdisage.text = "Wolfgang Amadeus Mozart (35) - Influential composer of the classical era."
                }
                "36" -> {
                    txtdisage.text = "Marie Curie (66) - Physicist and chemist known for her pioneering research on radioactivity."
                }
                else -> {
                    txtdisage.text = "you have selected an age which has no historical people"
                }
            }

            buttonclear.setOnClickListener {
                ageInput?.text?.clear()
                txtdisage.text = " "
            }
        }
    }

}