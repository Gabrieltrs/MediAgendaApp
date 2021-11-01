package com.example.telasmediagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Marcar_horario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marcar_horario)

        botao_finalizar.setOnClickListener{

            Tela_menu()
        }
    }

    private fun Tela_menu(){

        val telaMenu = Intent(this, Menu::class.java)
        startActivity(telaMenu)
    }
}