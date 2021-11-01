package com.example.telasmediagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        botao_marcarConsulta.setOnClickListener{

            Tela_de_marcarConsulta()
        }

        botao_areaConsultas.setOnClickListener{

            Tela_de_Consultas()
        }

        botao_editarDados.setOnClickListener{

            Tela_de_edicao()
        }
    }

    private fun Tela_de_marcarConsulta(){

        val tela_marcar = Intent(this, Marcar_consulta::class.java)
        startActivity(tela_marcar)
    }

    private fun Tela_de_Consultas(){

        val tela_areaConsultas = Intent(this, Area_consultas::class.java)
        startActivity(tela_areaConsultas)
    }

    private fun Tela_de_edicao(){
        val tela_editora = Intent(this, Editor_de_dados::class.java)
        startActivity(tela_editora)
    }
}