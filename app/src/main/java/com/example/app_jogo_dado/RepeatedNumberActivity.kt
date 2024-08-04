package com.example.app_jogo_dado

import android.animation.Animator
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.view.isVisible
import com.airbnb.lottie.LottieAnimationView

class RepeatedNumberActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repeated_number)

        val tv_number = findViewById<TextView>(R.id.tv_number)
        val imagem = findViewById<ImageView>(R.id.imagem)
        val animationView = findViewById<LottieAnimationView>(R.id.animationView)

        val argument = intent.getIntExtra("number", 0)
        tv_number.text = getString(R.string.title_repeated_number_acitivty, argument)
        imagem.isVisible = false
        tv_number.isVisible = false

        when (argument) {
            1 -> imagem.setImageResource(R.drawable.dice1)
            2 -> imagem.setImageResource(R.drawable.dice2)
            3 -> imagem.setImageResource(R.drawable.dice3)
            4 -> imagem.setImageResource(R.drawable.dice4)
            5 -> imagem.setImageResource(R.drawable.dice5)
            6 -> imagem.setImageResource(R.drawable.dice6)
        }

        animationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
            }

            override fun onAnimationEnd(animation: Animator) {
                animationView.isVisible = false
                imagem.isVisible = true
                tv_number.isVisible = true
            }

            override fun onAnimationCancel(animation: Animator) {
            }

            override fun onAnimationRepeat(animation: Animator) {
            }

        })


    }


}

