package com.example.dbsprojctone

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        Log.i("mytag", "main activity CREATED")



        var submitButton = findViewById<Button>(R.id.buttonSubmit)
        var usernameEditText = findViewById<EditText>(R.id.editTextUsername)
        var usernameTextView = findViewById<TextView>(R.id.textViewUsernanme)

        registerForContextMenu(usernameTextView)

        submitButton.setOnClickListener {






     /*       counter = counter + 1
            usernameTextView.setText("$counter")

            var username =   usernameEditText.text.toString()

            Log.i("mytag", "username is $username")*/



            /*  var username =   usernameEditText.text.toString()
                Toast.makeText(this, "username is $username", Toast.LENGTH_LONG).show()
                usernameTextView.setText(username)


                var myIntent = Intent(this, SecondActivity::class.java)
                myIntent.putExtra("keyun",username)

                var user = User("Ravi", "abcd")
                myIntent.putExtra("keyobj",user)

                startActivity(myIntent)*/

         /*   var myIntent = Intent("arvind")
            startActivity(myIntent)*/

            /*var myIntnet = Intent(Intent.ACTION_DIAL, Uri.parse("tel:958738838"))
            startActivity(myIntnet)*/

            /*var myIntnet = Intent(Intent.ACTION_VIEW, Uri.parse("https://yahoo.com"))
            startActivity(myIntnet)*/

        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.mymenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var myid = item.itemId

        if(myid == R.id.mytoast){
            Toast.makeText(this, "TOAST SELECTED", Toast.LENGTH_SHORT).show()
        }

        if(myid == R.id.mysearch){
            Toast.makeText(this, "SEARCHING... ", Toast.LENGTH_SHORT).show()

           var builder = AlertDialog.Builder(this)
               .setTitle("My Alert Dialog")
               .setMessage("do you want to exit the App ?")
               .setCancelable(false)
               .setIcon(R.drawable.spiderman)

               .setPositiveButton("Yes", DialogInterface.OnClickListener {
                       dialogInterface, i ->
                   this.finish()
               })
               .setNegativeButton("NO", DialogInterface.OnClickListener {
                       dialogInterface, i ->

               })

            var ad = builder.create()
            ad.show()

        }



        return super.onOptionsItemSelected(item)
    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.mymenu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        var myid = item.itemId
        if(myid == R.id.mytoast){
            Toast.makeText(this, "context item selected", Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }


    override fun onStart() {
        super.onStart()
        Log.e("mytag", "main activity started")

    }

    override fun onResume() {
        super.onResume()

        Log.w("mytag", "main activity resume")

    }

    override fun onPause() {
        super.onPause()

        Log.i("mytag", "main activity pause")

    }

    override fun onStop() {
        super.onStop()

        Log.i("mytag", "main activity stopped")

    }

    override fun onRestart() {
        super.onRestart()

        Log.i("mytag", "main activity restart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag", "main activity destroyed")

    }
}