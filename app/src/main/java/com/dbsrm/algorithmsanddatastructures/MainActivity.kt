package com.dbsrm.algorithmsanddatastructures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            val intent = Intent(this, Algorithms::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            Toast.makeText(this,"Still Working On it",Toast.LENGTH_LONG).show()
        }
        button2.setOnClickListener {
            Toast.makeText(this,"Still Working On it",Toast.LENGTH_LONG).show()
        }
        button4.setOnClickListener {
            Toast.makeText(this,"Still Working On it",Toast.LENGTH_LONG).show()
        }

        var str = "Right Now Only Algorithm Concepts are added, I am Working on others"
        displayText.setText(str)


    }
}
