package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val EditName = findViewById<EditText>(R.id.editTextTextPersonName).text

            val EditSex = findViewById<EditText>(R.id.editTextTextPersonName2).text

            val bundle = Bundle()
            bundle.putString("Name",EditName.toString())
            bundle.putString("Sex",EditSex.toString())

            val intent =Intent(this,MainActivity2::class.java)
            intent.putExtras(bundle)
            startActivityForResult(intent,1)

            findViewById<EditText>(R.id.editTextTextPersonName).visibility = View.INVISIBLE
            findViewById<EditText>(R.id.editTextTextPersonName2).visibility = View.INVISIBLE
            findViewById<TextView>(R.id.textView).visibility = View.INVISIBLE
            findViewById<TextView>(R.id.textView2).visibility = View.INVISIBLE
        }}





    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        data?.extras?.let{if(requestCode ==1 && resultCode == Activity.RESULT_OK){



            findViewById<TextView>(R.id.textView5).text =
                "Name:${it.getString("Name")}\n\n"+
                "Gender:${it.getString("Sex")}\n\n"+
                "Size:${it.getString("Size")}\n\n"+
                "Color:${it.getString("Color")}\n\n"


        }
    }}}
