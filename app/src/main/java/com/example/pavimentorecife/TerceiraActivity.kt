package com.example.pavimentorecife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TerceiraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)
        val backButton: Button = findViewById(R.id.btnVoltar)
        backButton.setOnClickListener {
            finish() // Finaliza a atividade atual (TerceiraActivity) e retorna à atividade anterior
        }
    }
}