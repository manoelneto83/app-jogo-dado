package com.example.app_jogo_dado

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    var ultValor: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botao = findViewById<Button>(R.id.botao)
        val imagem = findViewById<ImageView>(R.id.imagem)

        botao.setOnClickListener {
            val valor = (1..6).random()

            when (valor) {
                1 -> imagem.setImageResource(R.drawable.dice1)
                2 -> imagem.setImageResource(R.drawable.dice2)
                3 -> imagem.setImageResource(R.drawable.dice3)
                4 -> imagem.setImageResource(R.drawable.dice4)
                5 -> imagem.setImageResource(R.drawable.dice5)
                6 -> imagem.setImageResource(R.drawable.dice6)
            }
            if (valor == ultValor) {
                val intent = Intent(this, RepeatedNumberActivity::class.java)
                intent.putExtra("number", valor)
                startActivity(intent)
            }
            ultValor = valor


        }

    }
}