package com.dbsrm.algorithmsanddatastructures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.SortingFiles.BubbleSort
import com.dbsrm.algorithmsanddatastructures.SortingFiles.InsertionSort
import com.dbsrm.algorithmsanddatastructures.SortingFiles.MergeSort
import com.dbsrm.algorithmsanddatastructures.SortingFiles.SelectionSort
import kotlinx.android.synthetic.main.activity_sorting_techniques.*

class SortingTechniques : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorting_techniques)

        bubble.setOnClickListener {
            startActivity(Intent(this,BubbleSort::class.java))
        }
        insertion.setOnClickListener {
            startActivity(Intent(this,InsertionSort::class.java))
        }
        merge.setOnClickListener {
            startActivity(Intent(this,MergeSort::class.java))
        }
        selection.setOnClickListener {
            startActivity(Intent(this,SelectionSort::class.java))
        }
    }
}
