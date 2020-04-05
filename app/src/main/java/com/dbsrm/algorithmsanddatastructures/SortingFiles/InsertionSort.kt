package com.dbsrm.algorithmsanddatastructures.SortingFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_insertion_sort.*

class InsertionSort : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertion_sort)

        var str = "Algorithm:\n\n" +
                "Step 1 − If it is the first element, it is already sorted. return 1;\n" +
                "Step 2 − Pick next element\n" +
                "Step 3 − Compare with all elements in the sorted sub-list\n" +
                "Step 4 − Shift all the elements in the sorted sub-list that is greater than the \n" +
                "         value to be sorted\n" +
                "Step 5 − Insert the value\n" +
                "Step 6 − Repeat until list is sorted" +
                "\n" +
                "\n" +
                "PseudoCode:" +
                "\n\n" +
                "procedure insertionSort( A : array of items )\n" +
                "   int holePosition\n" +
                "   int valueToInsert\n" +
                "\t\n" +
                "   for i = 1 to length(A) inclusive do:\n" +
                "\t\n" +
                "      /* select value to be inserted */\n" +
                "      valueToInsert = A[i]\n" +
                "      holePosition = i\n" +
                "      \n" +
                "      /*locate hole position for the element to be inserted */\n" +
                "\t\t\n" +
                "      while holePosition > 0 and A[holePosition-1] > valueToInsert do:\n" +
                "         A[holePosition] = A[holePosition-1]\n" +
                "         holePosition = holePosition -1\n" +
                "      end while\n" +
                "\t\t\n" +
                "      /* insert the number at hole position */\n" +
                "      A[holePosition] = valueToInsert\n" +
                "      \n" +
                "   end for\n" +
                "\t\n" +
                "end procedure"
        InsertionText.setText(str)
    }
}
