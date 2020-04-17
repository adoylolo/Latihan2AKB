package com.muhammadfarhaan.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*
import android.widget.Spinner




class Register : AppCompatActivity() {

    lateinit var Nama : EditText
    var Jenis_Darah: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        Nama = findViewById(R.id.username_register)

        //Sinner Start
        // access the items of the list
        val jenis_blood = resources.getStringArray(R.array.jenisblood)

        // access the spinner
        val darah = findViewById<Spinner>(R.id.blood)
        if (darah != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, jenis_blood
            )
            darah.adapter = adapter

            darah.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    Jenis_Darah = darah.getSelectedItem().toString();
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
        //Spinner End


        //Sinner Start
        // access the items of the list
        val jenis_reshus = resources.getStringArray(R.array.jenisreshus)

        // access the spinner
        val res = findViewById<Spinner>(R.id.reshus)
        if (res != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, jenis_reshus
            )
            res.adapter = adapter

            res.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
        //Spinner End

        //Sinner Start
        // access the items of the list
        val jenis_pekerjaan = resources.getStringArray(R.array.jenispekerjaan)

        // access the spinner
        val pekerjaan = findViewById<Spinner>(R.id.job)
        if (pekerjaan != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, jenis_pekerjaan
            )
            pekerjaan.adapter = adapter

            pekerjaan.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
        //Spinner End

        btn_register.setOnClickListener {
            var name = Nama.text.toString()
            var jenis_darah = Jenis_Darah.toString()

            if (name.equals("")) {
                Toast.makeText(this, "Nama Tidak Boleh Dikosongkan", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else if (jenis_darah.equals("Blood Type"))
            {
                Toast.makeText(this,"Silahkan Pilih Golongan Darah Terlebih Dahulu",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else if (!agree_register.isChecked)
            {
                Toast.makeText(this, "Silahkan Isi Persetujuan", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                val intent = Intent(this, AlmostThere::class.java)
                intent.putExtra("Nama", name)
                intent.putExtra("Jenis_Darah", jenis_darah)
                startActivity(intent)
            }
        }
    }
}
