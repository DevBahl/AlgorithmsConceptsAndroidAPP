package com.dbsrm.algorithmsanddatastructures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.SearchingFiles.BinarySearch
import com.dbsrm.algorithmsanddatastructures.SearchingFiles.LinearSearch
import kotlinx.android.synthetic.main.activity_searching_techniques.*

class SearchingTechniques : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching_techniques)

        linear.setOnClickListener {
            startActivity(Intent(this,LinearSearch::class.java))
        }
        binary.setOnClickListener {
            startActivity(Intent(this,BinarySearch::class.java))
        }
    }
}
