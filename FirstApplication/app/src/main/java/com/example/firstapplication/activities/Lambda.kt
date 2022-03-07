package com.example.firstapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.firstapplication.databinding.ActivityLambdaBinding
import com.example.firstapplication.utils.TAG

class Lambda : AppCompatActivity() {

    private lateinit var binding: ActivityLambdaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLambdaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lambda()
        highOrderFunction()
    }

    private fun lambda() {
        val res = { num1: Int, num2: Int -> num1 + num2 }
        Log.d(TAG, "lambda: ${res(5, 8)}")
    }

    private fun highOrderFunction() {
        passFunctionToAnotherWithoutReturnType()
        passFunctionToAnotherWithReturnType()
    }

    private fun passFunctionToAnotherWithoutReturnType() {
        firstFunction("HyperSoft Inc.", ::secondFunction)
        firstFunction("HyperSoft.", ::secondFunction)
    }

    private fun firstFunction(str: String, myFunc: (String) -> Unit) {
        myFunc(str)
    }

    private fun secondFunction(key: String) {
        Log.d(TAG, "secondFunction: $key")
    }

    private fun passFunctionToAnotherWithReturnType() {
        firstFunctionReturn("HyperSoft", ::secondFunctionReturn)
        firstFunctionReturn("Hyper", ::secondFunctionReturn)
    }

    private fun firstFunctionReturn(str: String, myFuncReturn: (String) -> String) {
        val myFuncReturn1 = myFuncReturn(str)
        Log.d(TAG, "firstFunctionReturn: Asd: $myFuncReturn1")
    }

    private fun secondFunctionReturn(key: String): String {
        return key
    }
}