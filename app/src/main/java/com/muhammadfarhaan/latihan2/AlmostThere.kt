package com.muhammadfarhaan.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_almost_there.*

class AlmostThere : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)

        var intent = intent
        val text = intent.getStringExtra("Nama")
        val text2 = intent.getStringExtra("Jenis_Darah")

        btn_verify.setOnClickListener {
            val intent = Intent(this, VerifyAccount::class.java)
            intent.putExtra("Nama", text)
            intent.putExtra("Jenis_Darah", text2)
            startActivity(intent)
        }
    }
}
