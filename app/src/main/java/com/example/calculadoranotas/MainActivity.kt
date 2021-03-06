package com.example.calculadoranotas

import android.content.res.ColorStateList
import android.graphics.Color
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var clicks= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btCalcular = calcular
        val resultado = resultado



        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())


            if(media>=6 &&faltas<=10){
                resultado.setText("Parabéns, você foi aprovado" + "\n" + "Nota final: "  +media+ "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Infelizmente você foi reprovado" + "\n" + "Nota final: "  +media+ "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.RED)

            }

        }

    }


    }
