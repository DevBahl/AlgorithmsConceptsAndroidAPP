package com.dbsrm.algorithmsanddatastructures.AlgorithmFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_huffman.*

class huffman : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_huffman)

        var str = "HUFFMAN ALGORITHM\n" +
                "● Huffman Algorithm was developed by David Huffman in 1951.\n" +
                "● This is a technique which is used in a data compression or it can be said that it is a\n" +
                "coding technique which is used for encoding data.\n" +
                "● This technique is a mother of all data compression scheme.\n" +
                "● This idea is basically dependent upon the frequency, i.e. the frequency of the\n" +
                "corresponding character which needs to be compressed, and by that frequency, only\n" +
                "Huffman code will be generated.\n" +
                "● In case of Huffman coding, the most generated character will get the small code and\n" +
                "least generated character will get the large code.\n" +
                "● Huffman tree is a specific method of representing each symbol.\n" +
                "● This technique produces a code in such a manner that no codeword is a prefix of some\n" +
                "other code word. These codes are called as prefix code.\n" +
                "Algorithm for Huffman code\n" +
                "1. Input:-Number of message with frequency count.\n" +
                "2. Output: - Huffman merge tree.\n" +
                "3. Begin\n" +
                "4. Let Q be the priority queue,\n" +
                "  5. Q= {initialize priority queue with\n" +
                "6. Repeat n-1 times\n" +
                "7. Create a new node Z\n" +
                "8. X=extract_min(Q)\n" +
                "frequencies of all symbol or message}\n" +
                "9. Y=extract_min(Q)\n" +
                "10. Frequency(Z) =Frequency(X)+Frequency(y);\n" +
                "11. Insert (Z, Q)\n" +
                "12. End repeat\n" +
                "13. Return (extract_min(Q))\n" +
                "14. End."

        huffmannText.setText(str)
    }
}
