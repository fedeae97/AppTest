package com.example.testaplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btnMostrar=findViewById<Button>(R.id.Regresar1)
        var btnPruebaBD=findViewById<Button>(R.id.Prueba_DB)
        var btnLogin=findViewById<Button>(R.id.Login)
        var Mensaje=findViewById<TextView>(R.id.Mensaje)
        val titulostr = intent.getStringExtra("Titulo")

        Mensaje.setText(
            titulostr.toString()
        )


        btnMostrar.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnPruebaBD.setOnClickListener{
            val intent2= Intent(this, Consulta_info_test::class.java )
            startActivity(intent2)
        }
        btnLogin.setOnClickListener{
            val intent= Intent(this, Login_app::class.java)
            startActivity(intent)
        }

    }
}