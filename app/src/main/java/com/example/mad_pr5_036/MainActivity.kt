package com.example.mad_pr5_036

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn:Button=findViewById(R.id.button)
        val edt:EditText=findViewById(R.id.editTextText)
        btn.setOnClickListener{
            Browse(edt.text.toString())
        }
    }
    fun Browse(url:String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {startActivity(it)}
    }
   fun call(num:Double)
   {

   }
    fun calllog()
    {

    }
    fun gallery()
    {

    }
    fun camera()
    {

    }
    fun alarm()
    {

    }
}