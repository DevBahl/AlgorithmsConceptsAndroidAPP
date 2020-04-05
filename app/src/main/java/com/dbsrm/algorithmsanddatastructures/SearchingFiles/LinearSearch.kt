package com.dbsrm.algorithmsanddatastructures.SearchingFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_linear_search.*

class LinearSearch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_search)

        var str = "Linear search is a very simple search algorithm. In this type of search, a sequential search is made over all items one by one. Every item is checked and if a match is found then that particular item is returned, otherwise the search continues till the end of the data collection.\n" +
                "\n" +
                "Algorithm\n" +
                "Linear Search ( Array A, Value x)\n" +
                "\n" +
                "Step 1: Set i to 1\n" +
                "Step 2: if i > n then go to step 7\n" +
                "Step 3: if A[i] = x then go to step 6\n" +
                "Step 4: Set i to i + 1\n" +
                "Step 5: Go to Step 2\n" +
                "Step 6: Print Element x Found at index i and go to step 8\n" +
                "Step 7: Print element not found\n" +
                "Step 8: Exit\n" +
                "\n" +
                "The time complexity of the linear search is O(N) because each element in an array is compared only once."
        LinearText.setText(str)
    }
}
