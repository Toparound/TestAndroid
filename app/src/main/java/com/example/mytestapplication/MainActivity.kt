package com.example.mytestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val etLogin by lazy { findViewById<EditText>(R.id.et_login) }
    private val etPass by lazy { findViewById<EditText>(R.id.et_pass) }
    private val btnRegistration by lazy { findViewById<Button>(R.id.btn_registration) }
    private val btnSignin by lazy { findViewById<Button>(R.id.btn_signin) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignin.setOnClickListener{
            Toast.makeText(this,"логин: ${etLogin.text}\nпароль: ${etPass.text}",Toast.LENGTH_LONG).show()
        }
    }

}