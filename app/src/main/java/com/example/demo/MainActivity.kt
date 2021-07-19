package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val logButton: Button = findViewById(R.id.login_button)
        val userText:EditText=findViewById(R.id.username_input)
        val pwText:EditText=findViewById(R.id.password_input)

        logButton.setOnClickListener {
            val name: String = userText.text.toString()
            val password: String = pwText.text.toString()
            if(name=="qwerty"&&password=="qwerty") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
           // Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
        }
    }}