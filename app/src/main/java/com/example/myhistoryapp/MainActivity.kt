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



        buttonmm.setOnClickListener {
            var age = ageInput?.text.toString()
            txtdisage.setText("$age")

            if (age == "39") {
                txtdisage.setText(
                    "cleopatra (39) - Last active ruler of the Ptolemaic Kingdom of Egypt."
                )
            } else if (age == "55") {
                txtdisage.setText("Julius Caesar (55) - Roman general and statesman who played a critical role in the events that led to the demise of the Roman Republic"

                )
            } else if (age == "19") {
                 txtdisage.setText(
                    "Joan of Arc (19) - French heroine and military leader during the Hundred Years' War."
                )

          } else if (age == "67") {
                txtdisage.setText(
                    "Leonardo da Vinci (67) - Italian polymath known for his contributions to art, science, and engineering."
                )
            } else if (age == "81") {
                txtdisage.setText(
                    "Queen Victoria (81) - Queen of the United Kingdom of Great Britain and Ireland from 1837 to 1901."
                )
            } else if (age == "65") {
                txtdisage.setText(
                   " Genghis Khan (65) - Founder and first Great Khan of the Mongol Empire, the largest contiguous empire in history"
                )
            } else if (age == "88") {
                txtdisage.setText(
                    "Michelangelo (88) - Italian sculptor, painter, architect, and poet of the High Renaissance."
                )
            } else if (age == "32") {
                txtdisage.setText( "Anne Boleyn (35) - Queen of England from 1533 to 1536 as the second wife of King Henry VII"
                )
            } else if (age == "34") {
                txtdisage.setText("Wolfgang Amadeus Mozart (35) - Influential composer of the classical era."
                )
            } else if (age == "36") {
                txtdisage.setText(
                    "Marie Curie (66) - Physicist and chemist known for her pioneering research on radioactivity."
                )
            }
            else {
                txtdisage.setText("you have selected an age which has no historical people")
            }

            buttonclear.setOnClickListener {
                ageInput?.text?.clear()
                txtdisage.setText(" ")
            }
        }
    }

}