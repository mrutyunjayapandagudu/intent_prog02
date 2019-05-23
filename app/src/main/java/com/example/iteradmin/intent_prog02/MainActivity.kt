package com.example.iteradmin.intent_prog02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext= findViewById<EditText>(R.id.text1)
        val b1=findViewById<Button>(R.id.button)
        b1.setOnClickListener() {
            val s:String=edittext.text.toString()
            val i = Intent(applicationContext,Main2Activity::class.java)
            i.putExtra("name", s)
            startActivity(i)
        }
    }
}
