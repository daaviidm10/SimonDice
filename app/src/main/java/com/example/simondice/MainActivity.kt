package com.example.simondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var contadorRonda: Int = 0

    val button_red: Button = findViewById(R.id.rojo)
    val button_yellow: Button = findViewById(R.id.amarillo)
    val button_blue: Button = findViewById(R.id.azul)
    val button_green: Button = findViewById(R.id.verde)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var state: Boolean

        val empezarPartida: Button = findViewById(R.id.jugar)
        empezarPartida.setOnClickListener {


            val text = "GAME ON!"
            val duration = Toast.LENGTH_SHORT
            //llamo a la toast para que se muestre.
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
            Log.i("estado", "Listener")
            mostrarRonda()

        }

    }

    private fun mostrarRonda(){
        Log.i("estado", "mostrar Ronda")
        val t:TextView=findViewById(R.id.)
        contador++
    }
     suspend private fun startgame(){
        Log.i("estado", "empieza la partida")


    }

    private fun ejecutarSecuencia() {
        Log.i("estado", "se ejecuta la secuencia")
        delay(3000L)
        Log.i("estado", "Con delay")
    }

    suspend fun secuenciaBotones(){
        val Colores = arrayOf("#008000","#FFFF00","#3498DB","#EC4849")
    }


    private fun comprobarRonda(){
        Log.i("estado", "mostrar Ronda")
        if(0==0){
            contadorRonda+1
        }else{
            contadorRonda=0
        }


    }

}