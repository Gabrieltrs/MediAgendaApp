package com.example.telasmediagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao_cadastrar.setOnClickListener{

            Tela_de_cadastro()
        }
        botao_confirmaLogin.setOnClickListener{

            Tela_menu()
        }
    }

    private fun Tela_de_cadastro(){

        val tela_cadastro = Intent(this, Cadastro_paciente::class.java)
        startActivity(tela_cadastro)
    }

    private fun Tela_menu(){

        val mandar_menu = Intent(this, Menu::class.java)
        startActivity(mandar_menu)
    }
}