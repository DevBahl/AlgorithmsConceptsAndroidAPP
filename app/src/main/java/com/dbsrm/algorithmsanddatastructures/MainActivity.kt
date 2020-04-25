package com.dbsrm.algorithmsanddatastructures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            val intent = Intent(this, Algorithms::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            val intent = Intent(this,DataStructures::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this,SortingTechniques::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this,SearchingTechniques::class.java)
            startActivity(intent)
        }

        var str = "All the Concepts are added"
        displayText.setText(str)
    }
}
