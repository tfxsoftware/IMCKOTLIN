package com.example.imc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?,) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_acitivity)
        var imc = intent.getStringExtra("imc")
        //var imc = this.getExtraData()
        var imclabel = findViewById<TextView>(R.id.ImcCalculo)
        imclabel.text = imc
    }
}