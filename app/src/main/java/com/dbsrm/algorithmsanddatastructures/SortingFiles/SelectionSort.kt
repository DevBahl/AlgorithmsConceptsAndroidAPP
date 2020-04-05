package com.dbsrm.algorithmsanddatastructures.SortingFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_selection_sort.*

class SelectionSort : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_sort)

        var str = "Algorithm:\n\n" +
                "Step 1 − Set MIN to location 0\n" +
                "Step 2 − Search the minimum element in the list\n" +
                "Step 3 − Swap with value at location MIN\n" +
                "Step 4 − Increment MIN to point to next element\n" +
                "Step 5 − Repeat until list is sorted" +
                "\n" +
                "\n" +
                "PseudoCode:" +
                "\n\n" +
                "procedure selection sort \n" +
                "   list  : array of items\n" +
                "   n     : size of list\n" +
                "\n" +
                "   for i = 1 to n - 1\n" +
                "   /* set current element as minimum*/\n" +
                "      min = i    \n" +
                "  \n" +
                "      /* check the element to be minimum */\n" +
                "\n" +
                "      for j = i+1 to n \n" +
                "         if list[j] < list[min] then\n" +
                "            min = j;\n" +
                "         end if\n" +
                "      end for\n" +
                "\n" +
                "      /* swap the minimum element with the current element*/\n" +
                "      if indexMin != i  then\n" +
                "         swap list[min] and list[i]\n" +
                "      end if\n" +
                "   end for\n" +
                "\t\n" +
                "end procedure"
        SelectionText.setText(str)
    }
}
