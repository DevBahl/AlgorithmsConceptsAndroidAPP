package com.dbsrm.algorithmsanddatastructures.SortingFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_merge_sort.*

class MergeSort : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_merge_sort)

        var str = "Algorithm:\n\n" +
                "Step 1 − if it is only one element in the list it is already sorted, return.\n" +
                "Step 2 − divide the list recursively into two halves until it can no more be divided.\n" +
                "Step 3 − merge the smaller lists into new list in sorted order." +
                "\n" +
                "\n" +
                "PseudoCode:" +
                "\n\n" +
                "procedure mergesort( var a as array )\n" +
                "   if ( n == 1 ) return a\n" +
                "\n" +
                "   var l1 as array = a[0] ... a[n/2]\n" +
                "   var l2 as array = a[n/2+1] ... a[n]\n" +
                "\n" +
                "   l1 = mergesort( l1 )\n" +
                "   l2 = mergesort( l2 )\n" +
                "\n" +
                "   return merge( l1, l2 )\n" +
                "end procedure\n" +
                "\n" +
                "procedure merge( var a as array, var b as array )\n" +
                "\n" +
                "   var c as array\n" +
                "   while ( a and b have elements )\n" +
                "      if ( a[0] > b[0] )\n" +
                "         add b[0] to the end of c\n" +
                "         remove b[0] from b\n" +
                "      else\n" +
                "         add a[0] to the end of c\n" +
                "         remove a[0] from a\n" +
                "      end if\n" +
                "   end while\n" +
                "   \n" +
                "   while ( a has elements )\n" +
                "      add a[0] to the end of c\n" +
                "      remove a[0] from a\n" +
                "   end while\n" +
                "   \n" +
                "   while ( b has elements )\n" +
                "      add b[0] to the end of c\n" +
                "      remove b[0] from b\n" +
                "   end while\n" +
                "   \n" +
                "   return c\n" +
                "\t\n" +
                "end procedure"
        MergeText.setText(str)
    }
}
