package com.example.a31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(n: Int): String {
                var answer = ""
                var isEven :Boolean = false
                for (index in 0..n-1) {
                    if (!isEven) {
                        answer += "수"
                        isEven = true
                    } else {
                        answer += "박"
                        isEven = false
                    }
                }
                return answer
            }
        }

        val a = Solution()
        a.solution(3)
        a.solution(4)
    }
}