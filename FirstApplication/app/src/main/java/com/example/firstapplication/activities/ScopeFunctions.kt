package com.example.firstapplication.activities

import android.util.Log
import com.example.firstapplication.utils.TAG

class ScopeFunctions {

    init {
        applyScopeFunction()
    }

    private class Student {
        var name: String? = null
    }

    private fun applyScopeFunction() {
        val student = Student().apply { name = "Sohaib" }
        Log.d(TAG, "applyScopeFunction: ${student.name}")
    }

}