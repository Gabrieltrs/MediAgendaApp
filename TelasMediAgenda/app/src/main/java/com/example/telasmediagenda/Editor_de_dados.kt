package com.example.telasmediagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Editor_de_dados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor_de_dados)

        botao_retornarMenu.setOnClickListener{

            Tela_menu()
        }
    }

    private fun Tela_menu(){

        val telaMenu = Intent(this, Menu::class.java)
        startActivity(telaMenu)
    }
}