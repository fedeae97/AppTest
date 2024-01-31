package com.example.testaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pesoIngresasdo=findViewById<EditText>(R.id.ingPeso)
        var valorPeso=findViewById<TextView>(R.id.valorPeso)
        var btnMostrar=findViewById<Button>(R.id.botonMostrar)

        btnMostrar.setOnClickListener{

            var calcularPeso1=(pesoIngresasdo.text.toString().toInt()*8)
            /*if (calcularPeso1 == 1) { */
           /*    val intent= Intent(this, MainActivity2::class.java).apply {
                   putExtra("Titulo", calcularPeso1)
               }
                startActivity(intent)
*/
            /*}else {*/
                var calcularPeso=(pesoIngresasdo.text.toString().toInt()*5)
                valorPeso.setText(
                    calcularPeso1.toString()
                )
            val intent= Intent(this, MainActivity2::class.java).apply {
                putExtra("Titulo", calcularPeso1.toString())
            }
            startActivity(intent)
            /*}*/
        }
    }

}