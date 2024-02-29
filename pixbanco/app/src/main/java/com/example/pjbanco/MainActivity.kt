package com.example.pjbanco

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val COD_TELA = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnPix(view: View) {
        val txtSaldo = findViewById<EditText>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        //intent p trabalhar c/ mais de uma tela, passar um inf. p/ outro cara
        val intent = Intent(this, BtnpixActivity::class.java).apply {
            putExtra("sSaldo", saldo)
        }
        // startActivity(intent)
        startActivityForResult(intent, COD_TELA)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == COD_TELA && resultCode == Activity.RESULT_OK) {
            val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
            val sSaldo = data!!.getStringExtra("sSaldo")
            txtSaldo.setText(sSaldo)
        }
    }

    fun btnPagar(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent (this,PagarActivity::class.java).apply {
            putExtra("sSaldo", saldo)
        }
        //startActivity(intent)
        startActivityForResult(intent,COD_TELA)
    }

    fun btnDeposit(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent (this,DepositarActivity::class.java).apply {
            putExtra("sSaldo", saldo)
        }
        //startActivity(intent)
        startActivityForResult(intent,COD_TELA)
    }

    fun btnTransf(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent (this,TransferirActivity::class.java).apply {
            putExtra("sSaldo", saldo)
        }
        //startActivity(intent)
        startActivityForResult(intent,COD_TELA)
    }
}



