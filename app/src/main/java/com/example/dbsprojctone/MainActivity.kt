package com.example.dbsprojctone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var submitButton = findViewById<Button>(R.id.buttonSubmit)
        var usernameEditText = findViewById<EditText>(R.id.editTextUsername)
        var usernameTextView = findViewById<TextView>(R.id.textViewUsernanme)

        submitButton.setOnClickListener {
          var username =   usernameEditText.text.toString()
            Toast.makeText(this, "username is $username", Toast.LENGTH_LONG).show()
            usernameTextView.setText(username)
        }
    }
}