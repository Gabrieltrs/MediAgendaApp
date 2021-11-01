package com.example.telasmediagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Area_consultas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_consultas)

        botao_menu.setOnClickListener{

            Tela_deMenu()
        }
    }

    private fun Tela_deMenu(){

        val voltar_menu = Intent(this, Menu::class.java)
        startActivity(voltar_menu)
    }
}