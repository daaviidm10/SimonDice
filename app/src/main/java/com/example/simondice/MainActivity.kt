package com.example.simondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var contadorRonda : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val empezarPartida: Button = findViewById(R.id.jugar)
        empezarPartida.setOnClickListener {

            Log.i("estado", "Listener")
        val job: GlobalScope.launch(Dispatcher)
            mostrarRonda()
            startgame()

        }

    }
     suspend private fun startgame(){
        Log.i("estado", "empieza la partida")

        val mostrarRonda: TextView = findViewById(R.id.Ronda)
        mostrarRonda.text = contadorRonda.toString()
    }

    private fun ejecutarSecuencia() {
        Log.i("estado", "se ejecuta la secuencia")
    }
     private fun mostrarRonda(){
            Log.i("estado", "mostrar Ronda")

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