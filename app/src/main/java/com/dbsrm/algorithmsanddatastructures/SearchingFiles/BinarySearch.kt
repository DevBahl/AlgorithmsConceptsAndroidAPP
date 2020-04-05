package com.dbsrm.algorithmsanddatastructures.SearchingFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_binary_search.*

class BinarySearch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binary_search)

        var str = "Binary search is the most popular Search algorithm.It is efficient and also one of the most commonly used techniques that is used to solve problems.\n" +
                "\n" +
                "Binary search works only on a sorted set of elements. To use binary search on a collection, the collection must first be sorted.\n" +
                "\n" +
                "When binary search is used to perform operations on a sorted set, the number of iterations can always be reduced on the basis of the value that is being searched.\n" +
                "\n" +
                "\n" +
                "int binarySearch(int low,int high,int key)\n" +
                "{\n" +
                "   while(low<=high)\n" +
                "   {\n" +
                "     int mid=(low+high)/2;\n" +
                "     if(a[mid]<key)\n" +
                "     {\n" +
                "         low=mid+1;\n" +
                "     }\n" +
                "     else if(a[mid]>key)\n" +
                "     {\n" +
                "         high=mid-1;\n" +
                "     }\n" +
                "     else\n" +
                "     {\n" +
                "         return mid;\n" +
                "     }\n" +
                "   }\n" +
                "   return -1;                //key not found\n" +
                " }\n" +
                "\n" +
                "As we dispose off one part of the search case during every step of binary search, and perform the search operation on the other half, this results in a worst case time complexity of O(log N)"
        BinaryText.setText(str)
    }
}
