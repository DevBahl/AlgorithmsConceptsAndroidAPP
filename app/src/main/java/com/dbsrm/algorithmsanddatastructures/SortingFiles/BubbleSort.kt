package com.dbsrm.algorithmsanddatastructures.SortingFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_bubble_sort.*

class BubbleSort : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bubble_sort)

        var str = "Algorithm:\n\n" +
                "begin BubbleSort(list)\n" +
                "\n" +
                "   for all elements of list\n" +
                "      if list[i] > list[i+1]\n" +
                "         swap(list[i], list[i+1])\n" +
                "      end if\n" +
                "   end for\n" +
                "   \n" +
                "   return list\n" +
                "   \n" +
                "end BubbleSort" +
                "\n" +
                "\n" +
                "PseudoCode:" +
                "\n" +
                "\n" +
                "procedure bubbleSort( list : array of items )\n" +
                "\n" +
                "   loop = list.count;\n" +
                "   \n" +
                "   for i = 0 to loop-1 do:\n" +
                "      swapped = false\n" +
                "\t\t\n" +
                "      for j = 0 to loop-1 do:\n" +
                "      \n" +
                "         /* compare the adjacent elements */   \n" +
                "         if list[j] > list[j+1] then\n" +
                "            /* swap them */\n" +
                "            swap( list[j], list[j+1] )\t\t \n" +
                "            swapped = true\n" +
                "         end if\n" +
                "         \n" +
                "      end for\n" +
                "      \n" +
                "      /*if no number was swapped that means \n" +
                "      array is sorted now, break the loop.*/\n" +
                "      \n" +
                "      if(not swapped) then\n" +
                "         break\n" +
                "      end if\n" +
                "      \n" +
                "   end for\n" +
                "   \n" +
                "end procedure return list"
        BubbleText.setText(str)
    }
}
