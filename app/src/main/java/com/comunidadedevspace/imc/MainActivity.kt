package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// recuperar os edd text
// criar varial para recuperar os  dados pelo user e aplicar na nova tela de ui
//
        val peso = findViewById<TextInputEditText>(R.id.primeiroTextInput)
        val altura = findViewById<TextInputEditText>(R.id.segundoTextInput)
        val btcal = findViewById<button>(R.id.button_calcular)

        btcal.setOnClickListener {it:View
            val peso = peso.text
            val altura = altura.text


            printLn( peso + altura)

        }

    }
}