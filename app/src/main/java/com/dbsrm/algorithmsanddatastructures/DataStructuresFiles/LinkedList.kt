package com.dbsrm.algorithmsanddatastructures.DataStructuresFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_linked_list.*

class LinkedList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linked_list)

        val str = "Linked List\n" +
                "Creation-\n" +
                "   1.first=new node;{create the 1st  node of the list pointed by  first};\n" +
                "                2.Read(Data(first));\n" +
                "                3.NEXT(First)=NULL;\n" +
                "                4.Far a First;   [point Far to the First]\n" +
                "                5. For I=1 to N-1 repeat steps 6 to 10\n" +
                "                6.X=new node;\n" +
                "                7.Read(Data(X))\n" +
                "                8.NEXT(X)=NULL;\n" +
                "                9.NEXT(Far)=X;   {connect the nodes}\n" +
                "                10.Far=X;[shift the pointer to the last node of the list]\n" +
                "                                [end of For Loop]\n" +
                "                11.END\n" +
                "\n" +
                "Searching-\n" +
                "  1.If first=NULL then{\n" +
                "                                Print “List empty”;  STOP;}\n" +
                "                2.ptr=First;      [point ptr to the 1st node]\n" +
                "                3.while (ptr<>NULL) repeat steps 4 to 5\n" +
                "                4.If (DATA (ptr)= ‘X’)\n" +
                "                                Then {print “item found”;\n" +
                "                                STOP\n" +
                "                                }\n" +
                "                5.ptr=NEXT (ptr);  [shift ptr to the next node]\n" +
                "                                                [end of while]\n" +
                "                6.Print “item not found”;\n" +
                "                7.END\n" +
                "\n" +
                "Insertion-\n" +
                "  1.If first=NULL then{\n" +
                "                                Print “List empty”;  STOP;}\n" +
                "                2.ptr=First;      [point ptr to the 1st node]\n" +
                "                3.while (ptr<>NULL) repeat steps 4 to 5\n" +
                "                4.If (DATA (ptr)= ‘X’)\n" +
                "                                Then {print “item found”;\n" +
                "                                STOP\n" +
                "                                }\n" +
                "                5.ptr=NEXT (ptr);  [shift ptr to the next node]\n" +
                "                                                [end of while]\n" +
                "                6.Print “item not found”;\n" +
                "                7.END\n" +
                "Deletion-\n" +
                "       1.If (DATA(list)=’VAL’)then\n" +
                "                    {\n" +
                "                                Ptr=LIST;\n" +
                "                                LIST=NEXT(list);\n" +
                "                                Delete ptr;\n" +
                "                                Stop;\n" +
                "                    }\n" +
                "                       Back=list;\n" +
                "                       Ptr=list;\n" +
                "                2.while(ptr<>NULL) repeat step 3 to 5\n" +
                "                3.If(DATA(ptr)=’VAL’) then\n" +
                "                     {\n" +
                "                                NEXT(back)=NEXT(ptr);\n" +
                "                                Delete ptr;\n" +
                "                                Exit;}\n" +
                "                4.back=ptr;\n" +
                "                5.ptr=next(ptr);\n" +
                "                                [end of while loop]\n" +
                "                6.END\n"

        linkedlistText.setText(str)
    }
}
