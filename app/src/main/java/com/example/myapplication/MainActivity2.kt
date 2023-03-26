package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


            intent?.extras?.let{
                val ntmp = it.getString("Name")
                val stmp = it.getString("Sex")
                val button2 = findViewById<Button>(R.id.button2)
                button2.setOnClickListener {val EditSize = findViewById<EditText>(R.id.editTextTextPersonName4).text
                val EditColor = findViewById<EditText>(R.id.editTextTextPersonName3).text

                val bundle = Bundle()
                bundle.putString("Size",EditSize.toString())
                bundle.putString("Color",EditColor.toString())
                bundle.putString("Name",ntmp)
                bundle.putString("Sex",stmp)


                val intent = Intent().putExtras(bundle)
                setResult(Activity.RESULT_OK,intent.putExtras(bundle))
                finish()


            }}

    }
}