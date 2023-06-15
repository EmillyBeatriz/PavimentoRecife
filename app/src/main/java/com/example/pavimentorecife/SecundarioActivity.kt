package com.example.pavimentorecife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecundarioActivity : AppCompatActivity() {
    private lateinit var usuario: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secundario)
        usuario = intent.getStringExtra("usuario") ?: ""

        // Recuperar o extra da Intent
        usuario = intent.getStringExtra("usuario") ?: ""

        // Exibir o username em um TextView ou qualquer outro componente de exibição
        val usuarioTextView: TextView = findViewById(R.id.usuarioTextView)
        usuarioTextView.text = "Bem-vindo, $usuario!"

        val btnThird: Button = findViewById(R.id.btnTerceira)
        btnThird.setOnClickListener {
            val intent = Intent(this, TerceiraActivity::class.java)
            intent.putExtra("usuario", usuario)
            startActivity(intent)
        }
    }
}