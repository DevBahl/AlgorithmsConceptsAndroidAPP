package com.dbsrm.algorithmsanddatastructures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.AlgorithmFiles.*
import kotlinx.android.synthetic.main.activity_algorithms.*

class Algorithms : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algorithms)

        kruskal.setOnClickListener {
            startActivity(Intent(this,Kruskals::class.java))
        }
        prim.setOnClickListener {
            startActivity(Intent(this, prims::class.java))
        }
        mastertheorem.setOnClickListener {
            startActivity(Intent(this,MasterTheorem::class.java))
        }
        huffmann.setOnClickListener {
            startActivity(Intent(this,huffman::class.java))
        }
        greedy.setOnClickListener {
            startActivity(Intent(this,Greedy::class.java))
        }
        divideandconquer.setOnClickListener {
            startActivity(Intent(this,DivideAndConquer::class.java))
        }
    }
}
