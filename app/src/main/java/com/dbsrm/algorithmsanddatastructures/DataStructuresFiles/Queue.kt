package com.dbsrm.algorithmsanddatastructures.DataStructuresFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_queue.*

class Queue : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_queue)

        val str = "Queue-\n" +
                "Queue is also an abstract data type or a linear data structure, just like stack data structure, in which the first element is inserted from one end called the REAR(also called tail), and the removal of existing element takes place from the other end called as FRONT(also called head).\n" +
                "This makes queue as FIFO(First in First Out) data structure, which means that element inserted first will be removed first.\n" +
                "Which is exactly how queue system works in real world. If you go to a ticket counter to buy movie tickets, and are first in the queue, then you will be the first one to get the tickets. Right? Same is the case with Queue data structure. Data inserted first, will leave the queue first.\n" +
                "The process to add an element into queue is called Enqueue and the process of removal of an element from queue is called Dequeue.\n" +
                "Algorithm for ENQUEUE operation\n" +
                "1.\tCheck if the queue is full or not.\n" +
                "2.\tIf the queue is full, then print overflow error and exit the program.\n" +
                "3.\tIf the queue is not full, then increment the tail and add the element.\n" +
                "Algorithm for DEQUEUE operation\n" +
                "1.\tCheck if the queue is empty or not.\n" +
                "2.\tIf the queue is empty, then print underflow error and exit the program.\n" +
                "3.\tIf the queue is not empty, then print the element at the head and increment the head.\n"

        queueText.setText(str)
    }
}
