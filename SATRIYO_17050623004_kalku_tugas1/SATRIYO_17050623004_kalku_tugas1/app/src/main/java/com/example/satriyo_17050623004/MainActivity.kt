package com.example.satriyo_17050623004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun mincak (view:View){
    val angka1 = input1.text.toString().toInt()
    val angka2 = input2.text.toString().toInt()
        val res = angka1 - angka2
        hasil.text=res
    }
   fun tambahcak (view:View){

 val angka1 = input1.text.toString().toInt()
    val angka2 = input2.text.toString().toInt()
        val res = angka1 + angka2
        hasil.text = res
   }
    fun kalicak (view:View){
     val angka1 = input1.text.toString().toInt()
    val angka2 = input2.text.toString().toInt()
        val res = angka1 * angka2
        hasil.text=res

    }
    fun bagicak (view:View){
     val angka1 = input1.text.toString().toInt()
    val angka2 = input2.text.toString().toInt()
        val res = angka1 / angka2
hasil.text=res
    }
}
