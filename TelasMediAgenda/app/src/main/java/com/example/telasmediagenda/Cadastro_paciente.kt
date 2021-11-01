package com.example.telasmediagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Cadastro_paciente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_paciente)

        botao_CadastroRealizado.setOnClickListener{

            Voltar_login()
        }
    }

    private fun Voltar_login(){

        val retornar_login = Intent(this, MainActivity::class.java)
        startActivity(retornar_login)
    }
}