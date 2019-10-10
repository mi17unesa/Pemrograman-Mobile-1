package com.example.cobakotlin

import android.content.Intent
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

//        val actionBar = supportActionBar
//        val edt1 = findViewById(R.id.edt_satu) as EditText
//        val edt2 = findViewById(R.id.edt_dua) as EditText
        val hasil = findViewById(R.id.tv_hasil) as TextView
        val btnTambah = findViewById(R.id.btn_tambah) as Button
        val btnKurang = findViewById(R.id.btn_kurang) as Button
        val btnKali = findViewById(R.id.btn_kali) as Button
        val btnBagi = findViewById(R.id.btn_bagi) as Button

        btnTambah.setOnClickListener {
            val edt1 = findViewById(R.id.edt_satu) as EditText
            val edt2 = findViewById(R.id.edt_dua) as EditText
            if(edt1.text.isEmpty() || edt2.text.isEmpty()) {
                Toast.makeText(applicationContext, "silahkan isi", Toast.LENGTH_SHORT).show()
            }else{
                val a: Float = edt1.text.toString().toFloat()
                val b: Float = edt2.text.toString().toFloat()
                val c: Float =  a + b
                hasil.setText(c.toString())
            }
        }

        btnKurang.setOnClickListener {
                v ->  kurang()
        }

        btnKali.setOnClickListener {
            var edt1 = findViewById(R.id.edt_satu) as EditText
            var edt2 = findViewById(R.id.edt_dua) as EditText
            if(edt1.text.isEmpty() || edt2.text.isEmpty()) {
                Toast.makeText(applicationContext, "silahkan isi", Toast.LENGTH_SHORT).show()
            }else{
                var g: Float = edt1.text.toString().toFloat()
                var h: Float = edt2.text.toString().toFloat()
                var i: Float =  g * h
                hasil.setText(i.toString())
            }
        }

        btnBagi.setOnClickListener{
                v -> bagi()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.profile ->{
                intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun kurang() {
        val edt1 = findViewById(R.id.edt_satu) as EditText
        val edt2 = findViewById(R.id.edt_dua) as EditText
        val hasil = findViewById(R.id.tv_hasil) as TextView
        if(edt1.text.isEmpty() || edt2.text.isEmpty()){
            Toast.makeText(applicationContext,"silahkan isi", Toast.LENGTH_SHORT).show()
        } else {
            val a: Float = edt1.text.toString().toFloat()
            val b: Float = edt2.text.toString().toFloat()
            val c: Float = a - b
            hasil.setText(c.toString())
        }
    }

    fun bagi() {
        var edt1 = findViewById(R.id.edt_satu) as EditText
        var edt2 = findViewById(R.id.edt_dua) as EditText
        var hasil = findViewById(R.id.tv_hasil) as TextView
        if(edt1.text.isEmpty() || edt2.text.isEmpty()){
            Toast.makeText(applicationContext,"silahkan isi", Toast.LENGTH_SHORT).show()
        } else {
            var x: Float = edt1.text.toString().toFloat()
            var y: Float = edt2.text.toString().toFloat()
            var z: Float = x / y
            hasil.setText(z.toString())
        }
    }

    fun getEdt1(): Int {
        val edt1 = findViewById(R.id.edt_satu) as EditText
        val a: String = edt1.text.toString()
        return a.toInt()
    }

    fun getEdt2(): Int {
        val edt2 = findViewById(R.id.edt_dua) as EditText
        val b: String = edt2.text.toString()
        return b.toInt()
    }
    }

