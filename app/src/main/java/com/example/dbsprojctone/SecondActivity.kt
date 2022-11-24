package com.example.dbsprojctone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("mytag", "seond activity created")

        var resultTextView = findViewById<TextView>(R.id.textViewResult)

        resultTextView.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
      /*  var resultTextView = findViewById<TextView>(R.id.textViewResult)

        var res = intent.extras?.getString("keyun")
        var obj= intent.getParcelableExtra<User>("keyobj")
        var un = obj?.username

        resultTextView.text = un*/
    }


    override fun onStart() {
        super.onStart()
        Log.i("mytag", "main activity started")

    }

    override fun onResume() {
        super.onResume()

        Log.i("mytag", "second activity resume")

    }

    override fun onPause() {
        super.onPause()

        Log.i("mytag", "second activity pause")

    }

    override fun onStop() {
        super.onStop()

        Log.i("mytag", "second activity stopped")

    }

    override fun onRestart() {
        super.onRestart()

        Log.i("mytag", "second activity restart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag", "second activity destroyed")

    }
}