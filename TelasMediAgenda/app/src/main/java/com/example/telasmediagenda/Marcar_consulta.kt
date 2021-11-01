package com.example.telasmediagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Marcar_consulta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marcar_consulta)

        botao_continuarMarcar.setOnClickListener{

            Tela_de_marcarHorario()
        }
    }

    private fun Tela_de_marcarHorario(){

        val tela_horario = Intent(this, Marcar_horario::class.java)
        startActivity(tela_horario)
    }
}