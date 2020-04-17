package com.muhammadfarhaan.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}


/*
* Tanggal Pengerjaan  : 11-April-2020 ~ 17-April-2020
* Deskripsi Pekerjaan : Membuat kelas Login (Main Activity), Register, AlmostThere, VerifyAccount dan UserHome.
*                       Membuat layout activity_main, activity_register, activity_almost_there, activity_verify_account, dan activity_user_home.
*                       Membuat fungsi (Intent) untuk pindah dari activity ke activity lain.
*                       Membuat validasi untuk Username agar tidak kosong.
*                       Membuat validasi untuk Blood Type agar tidak diisi dengan Judulnya (Blood Type).
*                       Membuat validasi untuk Checkbox Agree agar diisi.
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */
