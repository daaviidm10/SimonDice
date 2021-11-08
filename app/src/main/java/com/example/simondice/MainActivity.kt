
package com.example.simondice

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    var contador=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val empezarPartida: Button = findViewById(R.id.jugar)

        empezarPartida.setOnClickListener{
            val text = "A jugar"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
            Log.i("estado" , "Boton play presionado")
            mostrarRonda()

            val job= GlobalScope.launch (Dispatchers.Main){
                secuenciaBotones()
            }

        }

    }
    //Método mostrar ronda
    private fun mostrarRonda(){
        Log.i("ronda", "Ronda mostrada")
        //Añado el contenido del contador a un textView
        val t:TextView=findViewById(R.id.Ronda)
        contador++
        t.setText("Ronda: "+contador.toString())
    }
    suspend fun ejecutarSecuencia() {
        Log.i("Secuencia","Secuencia Ejecutada")
        delay(3000L)
        Log.i("estado", "Con delay")

    }

    private fun mensajeUsuario() {
        Log.i("mensaje","Mensaje mostrado")

    }

    private fun comprobarSecuencia() {
        Log.i("Secuencia","Secuencia comprobada")


    }
    suspend fun secuenciaBotones() {
        val Colores = arrayOf("#008000","#FFFF00","#3498DB","#EC4849")
        var arrayBotones = hashMapOf<Int,Button>()

        arrayBotones[0]= findViewById(R.id.verde)
        arrayBotones[1]= findViewById(R.id.amarillo)
        arrayBotones[2] = findViewById(R.id.azul)
        arrayBotones[3] = findViewById(R.id.rojo)

        var secuencia:Array<Int> = arrayOf()
        var random = (0..3).random()
        secuencia = arrayOf(random)
        for(i in 1..contador) {
            delay(500L)
            arrayBotones[contador]?.setBackgroundColor(Color.WHITE)
            delay(500L)
            arrayBotones[contador]?.setBackgroundColor(Color.parseColor(Colores[contador]))

        }

    }


}