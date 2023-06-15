package com.example.pavimentorecife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
    }

    fun loginButtonClick(view: View) {
        val usuario = etUsername.text.toString()
        val password = etPassword.text.toString()

        if (usuario.isNotEmpty() && password.isNotEmpty()) {
            // Aqui você pode adicionar a lógica para autenticar o usuário,
            // como verificar se o nome de usuário e a senha são válidos.
            // Por enquanto, vamos apenas exibir uma mensagem de sucesso.
            Toast.makeText(this, R.string.loginsucesso, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecundarioActivity::class.java)
            intent.putExtra("usuario", usuario)
            startActivity(intent)
        } else {
            Toast.makeText(this, R.string.campovazio, Toast.LENGTH_SHORT).show()
        }
    }
}