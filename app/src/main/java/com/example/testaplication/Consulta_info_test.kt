package com.example.testaplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Consulta_info_test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_test_consulta)


        var Mensaje=findViewById<TextView>(R.id.Muestra_num)

        Mensaje.setText(
            "test"
        )
    }


}