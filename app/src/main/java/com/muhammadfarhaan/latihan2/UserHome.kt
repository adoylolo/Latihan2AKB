package com.muhammadfarhaan.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UserHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_home)

        var intent = intent
        val text = intent.getStringExtra("Nama")
        val text2 = intent.getStringExtra("Jenis_Darah")

        val hasil = findViewById<TextView>(R.id.user_nama)
        hasil.text = ""+text+""

        val hasil2 = findViewById<TextView>(R.id.blood_type)
        hasil2.text = "Blood Type : "+text2+""


    }
}
