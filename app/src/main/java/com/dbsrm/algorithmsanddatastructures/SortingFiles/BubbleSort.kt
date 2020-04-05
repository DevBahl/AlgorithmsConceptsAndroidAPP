package com.dbsrm.algorithmsanddatastructures.SortingFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_bubble_sort.*

class BubbleSort : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bubble_sort)

        var str = ""
        BubbleText.setText(str)
    }
}
