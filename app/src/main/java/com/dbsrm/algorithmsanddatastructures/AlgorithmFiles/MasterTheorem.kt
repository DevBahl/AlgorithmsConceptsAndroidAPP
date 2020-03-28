package com.dbsrm.algorithmsanddatastructures.AlgorithmFiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbsrm.algorithmsanddatastructures.R
import kotlinx.android.synthetic.main.activity_mastertheorem.*

class MasterTheorem : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mastertheorem)



        var str = "MASTER THEOREM-\n" +
                "Master theorem is used in calculating the time complexity of recurrence relations (divide and conquer algorithms) in a simple and quick way.\n" +
                "Case-01\u200B:\n" +
                "If a > bk, then T(n) = θ (nlogba)\n" +
                "Case-02\u200B:\n" +
                "If a = bk and\n" +
                "If p < -1, then T(n) = θ (nlogba)\n" +
                "If p = -1, then T(n) = θ (nlogba.log2n)\n" +
                "If p > -1, then T(n) = θ (nlogba.logp+1n)\n" +
                "Case-03\u200B:\n" +
                "If a < bk and\n" +
                "Ifp<0, thenT(n)=O(nk)\n" +
                "If p >= 0, then T(n) = θ (nklogpn)\n" +
                "PRACTICE PROBLEMS BASED ON MASTER THEOREM- Problem-01\u200B:\n" +
                "Solve the following recurrence relation using Master’s theorem- T(n) = 3T(n/2) + n2\n" +
                " \n" +
                " Solution-\n" +
                "We compare the given recurrence relation with T(n) = aT(n/b) + θ (nklogpn). Then, we have-\n" +
                "a=3\n" +
                "b=2\n" +
                "k=2 p=0\n" +
                "Now, a = 3 and bk = 22 = 4. Clearly, a < bk.\n" +
                "So, we follow case-03.\n" +
                "Since p = 0, so we have- T(n) = θ (nklogpn)\n" +
                "T(n) = θ (n2log0n)\n" +
                "Thus,\n" +
                "T(n) = θ (n2)\n" +
                "Problem-02\u200B:\n" +
                "Solve the following recurrence relation using Master’s theorem- T(n) = 2T(n/2) + nlogn\n" +
                "\n" +
                "Solution-\n" +
                "We compare the given recurrence relation with T(n) = aT(n/b) + θ (nklogpn). Then, we have-\n" +
                "a=2\n" +
                "b=2\n" +
                "k=1 p=1\n" +
                "Now, a = 2 and bk = 21 = 2. Clearly, a = bk.\n" +
                "So, we follow case-02.\n" +
                "Since p = 1, so we have- T(n) = θ (nlogba.logp+1n) T(n) = θ (nlog22.log1+1n)\n" +
                "Thus,\n" +
                "T(n) = θ (nlog2n)"

        mastertheoremText.setText(str)

    }
}
