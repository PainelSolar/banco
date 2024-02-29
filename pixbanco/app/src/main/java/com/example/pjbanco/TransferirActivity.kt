package com.example.pjbanco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TransferirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transferir)
        setSupportActionBar(findViewById(R.id.toolbar3))

        val saldo = intent.getStringExtra("sSaldo")
        val txtSaldo = findViewById<TextView>(R.id.txtsaldo2)
        txtSaldo.setText(saldo.toString())
    }
}