package com.dbsrm.algorithmsanddatastructures.AlgorithmFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_kruskals.*

class Kruskals : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kruskals)

        var str = "Kruskal’s algorithm\n" +
                "A minimum spanning tree has (V – 1) edges where V is the number of vertices in the given graph.\n" +
                "Below are the steps for finding MST using Kruskal’s algorithm\n" +
                "1. Sort all the edges in non-decreasing order of their weight.\n" +
                "2. Pick the smallest edge. Check if it forms a cycle with the spanning tree formed so far. If cycle is not formed, include this edge. Else, discard it.\n" +
                "3. Repeat step#2 until there are (V-1) edges in the spanning tree.\n" +
                "The graph contains 9 vertices and 14 edges. So, the minimum spanning tree formed will be having (9 – 1) = 8 edges.\n" +
                "After sorting: Weight Src Dest 176 282 265 401 425 686 723 778 807 812 934\n" +
                "10 5 4\n" +
                "11 1 7\n" +
                "14 3 5\n" +
                "Now pick all edges one by one from sorted list of edges 1. Pick edge 7-6: No cycle is formed, include it.\n" +
                "   \n" +
                " 2. Pick edge 8-2: No cycle is formed, include it.\n" +
                "3. Pick edge 6-5: No cycle is formed, include it.\n" +
                "4. Pick edge 0-1: No cycle is formed, include it.\n" +
                "5. Pick edge 2-5: No cycle is formed, include it.\n" +
                "6. Pick edge 8-6: Since including this edge results in cycle, discard it. 7. Pick edge 2-3: No cycle is formed, include it.\n" +
                "8. Pick edge 7-8: Since including this edge results in cycle, discard it. 9. Pick edge 0-7: No cycle is formed, include it.\n" +
                "     \n" +
                " 10. Pick edge 1-2: Since including this edge results in cycle, discard it. 11. Pick edge 3-4: No cycle is formed, include it.\n" +
                "Since the number of edges included equals (V – 1), the algorithm stops here."

        kruskalText.setText(str)
    }
}
