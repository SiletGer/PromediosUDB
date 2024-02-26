package com.example.promediosudb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCalcular:Button=findViewById(R.id.btnCalcular)
        botonCalcular.setOnClickListener { realizarCalculo() }

    }

    private fun realizarCalculo() {

        val CampoNombre:EditText=findViewById(R.id.idNombretxt)
        val campoNota1:EditText=findViewById(R.id.idNota1txt)
        val campoNota2:EditText=findViewById(R.id.idNota2txt)
        val campoNota3:EditText=findViewById(R.id.idNota3txt)
        val campoNota4:EditText=findViewById(R.id.idNota4txt)
        val campoNota5:EditText=findViewById(R.id.idNota5txt)
        val MensajeReultado:TextView=findViewById(R.id.txtResultado)

        val nombre:String=CampoNombre.text.toString()
        val nota1:Double=campoNota1.text.toString().toDouble()
        val nota2:Double=campoNota2.text.toString().toDouble()
        val nota3:Double=campoNota3.text.toString().toDouble()
        val nota4:Double=campoNota4.text.toString().toDouble()
        val nota5:Double=campoNota5.text.toString().toDouble()

        var promedio:Double=(nota1 + nota2 + nota3 + nota4 + nota5)/5

        val redondearpromedio = String.format("%.2f", promedio)

        println("el Promedio de $nombre es de $redondearpromedio")
        Log.i("salida", "El promedio es $redondearpromedio")

        var result=""

        if (promedio>=6){
            result="$redondearpromedio, la materia fue Aprovada"
            Log.i("salida", result)
        }else{
            result="$redondearpromedio, la materia fue Reprovada"
            Log.i("salida", result)
        }

        MensajeReultado.text="el Promedio de $nombre es de $result"

    }
}