package com.example.pjbanco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PagarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagar)
        setSupportActionBar(findViewById(R.id.toobar2))

        val saldo = intent.getStringExtra("sSaldo")
        val txtSaldo = findViewById<TextView>(R.id.txtsaldo1)
        txtSaldo.setText(saldo.toString())

    }
}