package com.dbsrm.algorithmsanddatastructures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.DataStructuresFiles.LinkedList
import com.dbsrm.algorithmsanddatastructures.DataStructuresFiles.Queue
import com.dbsrm.algorithmsanddatastructures.DataStructuresFiles.Stack
import kotlinx.android.synthetic.main.activity_data_structures.*

class DataStructures : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_structures)

        linkedlist.setOnClickListener {
            val intent = Intent(this, LinkedList::class.java)
            startActivity(intent)
        }
        stack.setOnClickListener {
            val intent = Intent(this, Stack::class.java)
            startActivity(intent)
        }
        queue.setOnClickListener {
            val intent = Intent(this, Queue::class.java)
            startActivity(intent)
        }

    }
}
