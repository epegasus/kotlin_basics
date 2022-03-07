package com.example.firstapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.firstapplication.utils.TAG
import com.example.firstapplication.databinding.ActivityFunctionsFeaturesBinding
import kotlin.math.sqrt

class FunctionsFeatures : AppCompatActivity() {

    private lateinit var binding: ActivityFunctionsFeaturesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFunctionsFeaturesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        functionTypes()
    }

    private fun functionTypes() {
        builtInFunctions()
        customFunctions()
    }

    private fun builtInFunctions() {
        val sqrt = sqrt(16.0)
        Log.d(TAG, "builtInFunctions: $sqrt")
    }

    private fun customFunctions() {
        simpleFunction()
        parameterizedFunction(1, "ABC")
        parameterizedFunction(2, "abc")
        val returnFunction = returnFunction()
        Log.d(TAG, "customFunctions: $returnFunction")

        inlineFunction()
    }

    private fun simpleFunction() {
        Log.d(TAG, "firstFunction: called")
    }

    private fun parameterizedFunction(i: Int, s: String) {
        Log.d(TAG, "parameterizedFunction: $i : $s")
    }

    private fun returnFunction(): String {
        return "abc"
    }

    private fun inlineFunction() {
        val sum = { num1: Int, num2: Int -> num1 + num2 }
        Log.d(TAG, "inlineFunction: " + sum(4,6))
    }
}
