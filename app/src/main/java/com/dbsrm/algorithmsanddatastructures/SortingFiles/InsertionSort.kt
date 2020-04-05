package com.dbsrm.algorithmsanddatastructures.SortingFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_insertion_sort.*

class InsertionSort : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertion_sort)

        var str = ""
        InsertionText.setText(str)
    }
}
