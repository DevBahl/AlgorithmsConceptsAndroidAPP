package com.dbsrm.algorithmsanddatastructures.AlgorithmFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_divideandconquer.*

class DivideAndConquer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_divideandconquer)

        var str = "Divide and conquer\n" +
                "\n" +
                "Divide and Conquer is an algorithmic paradigm. A typical Divide and Conquer algorithm solves a problem using following three steps.\n" +
                "\n" +
                "1. Divide: Break the given problem into subproblems of same type.\n" +
                "2. Conquer: Recursively solve these subproblems\n" +
                "3. Combine: Appropriately combine the answers\n" +
                "\n" +
                "\n" +
                "\n" +
                "Following are some standard algorithms that are Divide and Conquer algorithms.\n" +
                "\n" +
                "1)\tBinary search:\n" +
                "Binary Search is a searching algorithm. In each step, the algorithm compares the input element x with the value of the middle element in array. If the values match, return the index of middle. Otherwise, if x is less than the middle element, then the algorithm recurs for left side of middle element, else recurs for right side of middle element.\n" +
                "\n" +
                "\n" +
                "2)Quicksort:\n" +
                " Quicksort is a sorting algorithm. The algorithm picks a pivot element, rearranges the array elements in such a way that all elements smaller than the picked pivot element move to left side of pivot, and all greater elements move to right side. Finally, the algorithm recursively sorts the subarrays on left and right of pivot element.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "3) Merge sort:\n" +
                "Merge Sort is also a sorting algorithm. The algorithm divides the array in two halves, recursively sorts them and finally merges the two sorted halves.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "4)Closest Pair of Points:\n" +
                " Closest Pair of Points The problem is to find the closest pair of points in a set of points in x-y plane. The problem can be solved in O(n^2) time by calculating distances of every pair of points and comparing the distances to find the minimum. The Divide and Conquer algorithm solves the problem in O(nLogn) time.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Pseudo code step:\n" +
                "\n" +
                "\n" +
                "1) We sort all points according to x coordinates.\n" +
                "2) Divide all points in two halves.\n" +
                "3) Recursively find the smallest distances in both subarrays.\n" +
                "4) Take the minimum of two smallest distances. Let the minimum be d.\n" +
                "5) Create an array strip[] that stores all points which are at most d distance away from the middle line dividing the two sets.\n" +
                "6) Find the smallest distance in strip[].\n" +
                "7) Return the minimum of d and the smallest distance calculated in above step 6.\n" +
                "\n" +
                "\n" +
                "5) Strassen’s Algorithm:\n" +
                "\n" +
                "Strassen’s Algorithm is an efficient algorithm to multiply two matrices. A simple method to multiply two matrices need 3 nested loops and is O(n^3). Strassen’s algorithm multiplies two matrices in O(n^2.8974) time. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"
        divideText.setText(str)
    }
}
