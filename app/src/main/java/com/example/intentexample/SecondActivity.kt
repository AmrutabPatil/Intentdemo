package com.example.intentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intent=intent
        val name=intent.getStringExtra("Name")
        val email=intent.getStringExtra("Email")

        val phone=intent.getStringExtra("Phone")



        val resultTV=findViewById<TextView>(R.id.resultTv)

        resultTv.text = "Name: "+name+"\nEmail: "+email+"\nPhone: "+phone









    }
}