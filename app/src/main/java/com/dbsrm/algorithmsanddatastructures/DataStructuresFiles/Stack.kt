package com.dbsrm.algorithmsanddatastructures.DataStructuresFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_stack.*

class Stack : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stack)

        val str = "Stack-\n" +
                "Basic Operations\n" +
                "Stack operations may involve initializing the stack, using it and then de-initializing it. Apart from these basic stuffs, a stack is used for the following two primary operations −\n" +
                "•\tpush() − Pushing (storing) an element on the stack.\n" +
                "•\tpop() − Removing (accessing) an element from the stack.\n" +
                "When data is PUSHed onto stack.\n" +
                "To use a stack efficiently, we need to check the status of stack as well. For the same purpose, the following functionality is added to stacks −\n" +
                "•\tpeek() − get the top data element of the stack, without removing it.\n" +
                "•\tisFull() − check if stack is full.\n" +
                "•\tisEmpty() − check if stack is empty.\n" +
                "At all times, we maintain a pointer to the last PUSHed data on the stack. As this pointer always represents the top of the stack, hence named top. The top pointer provides top value of the stack without actually removing it.\n" +
                "\n" +
                "Algorithm for pushing-\n" +
                "begin procedure push: stack, data\n" +
                "\n" +
                "   if stack is full\n" +
                "      return null\n" +
                "   endif\n" +
                "   \n" +
                "   top ← top + 1\n" +
                "   stack[top] ← data\n" +
                "\n" +
                "end procedure\n" +
                "popping-\n" +
                "begin procedure pop: stack\n" +
                "\n" +
                "   if stack is empty\n" +
                "      return null\n" +
                "   endif\n" +
                "   \n" +
                "   data ← stack[top]\n" +
                "   top ← top - 1\n" +
                "   return data\n" +
                "\n" +
                "end procedure\n"

        stackText.setText(str)
    }
}
