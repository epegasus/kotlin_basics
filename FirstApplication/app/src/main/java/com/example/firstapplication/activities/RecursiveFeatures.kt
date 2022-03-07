package com.example.firstapplication.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapplication.databinding.ActivityRecursiveFeaturesBinding
import com.example.firstapplication.utils.TAG
import kotlin.system.measureNanoTime

class RecursiveFeatures : AppCompatActivity() {

    private lateinit var binding: ActivityRecursiveFeaturesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecursiveFeaturesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val elapsedTime = measureNanoTime {
            val recursiveFunctions = recursiveFunctions(20)
            Log.d(TAG, "onCreate: $recursiveFunctions")
        }
        Log.d(TAG, "elapsedTime: $elapsedTime")


        val elapsedTime1 = measureNanoTime {
            val tailRecursive = tailRecursive(20)
            Log.d(TAG, "onCreate: $tailRecursive")
        }
        Log.d(TAG, "elapsedTime1: $elapsedTime1")
    }

    private fun recursiveFunctions(n: Int): Int {
        return if (n == 1)
            n
        else {
            n * recursiveFunctions(n - 1)
        }
    }

    private tailrec fun tailRecursive(n: Int, temp: Int = 1): Int {
        return if (n == 1)
            temp
        else {
            tailRecursive(n - 1, temp * n)
        }
    }
}