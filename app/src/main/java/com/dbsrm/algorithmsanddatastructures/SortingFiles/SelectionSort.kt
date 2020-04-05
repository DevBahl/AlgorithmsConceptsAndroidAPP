package com.dbsrm.algorithmsanddatastructures.SortingFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_selection_sort.*

class SelectionSort : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_sort)

        var str = ""
        SelectionText.setText(str)
    }
}
