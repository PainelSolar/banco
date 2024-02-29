package com.example.pjbanco

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class TransferirActivity : AppCompatActivity() {
    package com.example.pjbanco

    import android.annotation .SuppressLint
    import android.app.Activity
    import android.content.Intent
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.Button
    import android.widget.EditText
    import android.widget.TextView
    import android.widget.Toast

    class ActivityTrasnferir : AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_transferir)
            setSupportActionBar(findViewById(R.id.toolbar3))

            val saldo = intent.getStringExtra("sSaldo")
            val txtSaldo = findViewById<TextView>(R.id.txtsaldo1)
            txtSaldo.setText(saldo.toString())
            var nsaldo = saldo.toString().toDouble()
            val btConf = findViewById<Button>(R.id.button)

            btConf.setOnClickListener {
                val data = Intent()
                val valorPix = findViewById<EditText>(R.id.edtValorPix1)
                var nvalor = valorPix.text.toString().toDouble()
                if (nvalor > nsaldo) {
                    Toast.makeText(
                        this, "Saldo de $nsaldo é insuficiente para $nvalor",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    nsaldo += nvalor
                }
                val txtSaldo = nsaldo.toString()
                data.putExtra("sSaldo", txtSaldo)
                setResult(Activity.RESULT_OK, data)
                Toast.makeText(this, "$nsaldo", Toast.LENGTH_SHORT).show()
                valorPix.setText("".toString())
                finish()

            }
        }
    }
}




