package com.muhammadfarhaan.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_almost_there.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_verify_account.*

class VerifyAccount : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_account)

        var intent = intent
        val text = intent.getStringExtra("Nama")
        val text2 = intent.getStringExtra("Jenis_Darah")

        btn_send.setOnClickListener {
            val intent = Intent(this, UserHome::class.java)
            intent.putExtra("Nama", text)
            intent.putExtra("Jenis_Darah", text2)
            startActivity(intent)
        }
    }
}
