package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botao = findViewById<Button>(R.id.button)
        val textpeso = findViewById<EditText>(R.id.Editpeso)
        val textaltura = findViewById<EditText>(R.id.editAltura)

        botao.setOnClickListener{
                var peso = textpeso.text.toString().toDouble()
                var altura = textaltura.text.toString().toDouble()
                var imc = calcularImc(peso, altura).toString();
                val i: Intent = Intent(this, SecondActivity::class.java)
                i.putExtra("imc", imc)
                startActivity(i)

        }

    }
    fun calcularImc(peso: Double, altura:Double):Double {
        return peso/(altura*altura)
    }
}
