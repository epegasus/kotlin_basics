package com.example.firstapplication.activities

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapplication.databinding.ActivityMainBinding
import com.example.firstapplication.utils.TAG

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var n: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ScopeFunctions()

        //CollectionsFeatures()
        // startActivity(Intent(this, Lambda::class.java))
        //finish()
        //topics()

        binding.btnToastMain.setOnClickListener { onToastClick() }
        binding.btnCountMain.setOnClickListener { onCountClick() }
        binding.btnRandomMain.setOnClickListener { onRandomClick() }
        binding.btnOperationMain.setOnClickListener { onOperationClick() }


        /*val student = Student("Sohaib", "imageUrl", System.currentTimeMillis())
        Log.d(TAG, "onCreate: ${student.username}")*/
    }

    private fun topics() {
        returnTypeFunction()
        // String
        characterAtSpecificIndex()
        subString()
        contains()
        // Arrays
        arrayDeclaration()
        arrayFeatures()
        // Range
        rangeFeatures()
        // When (Switches)
        whenFeatures()
        // Loops
        forLoopFeature()
        whileLoopFeature()
        doWhileLoopFeature()
        forEach()
        // continue
        continueFeature()
        // break
        breakFeature()
    }

    private fun returnTypeFunction() {
        val temp = getValue()
        binding.tvTextMain.text = temp
    }

    private fun getValue(): String {
        return "I am returning Value"
    }

    private fun characterAtSpecificIndex() {
        val temp = "beginners_book"
        binding.tvTextMain.text = temp[1].toString()
    }

    private fun subString() {
        val temp = "beginners_book"
        binding.tvTextMain.text = temp.subSequence(1, 6)
    }

    private fun contains() {
        val temp = "beginners_book"
        binding.tvTextMain.text = temp.contains("_b").toString()
    }

    private fun arrayDeclaration() {
        val tempArray = arrayOf(1, "Sohaib", 923206313745)
        binding.tvTextMain.text = tempArray.contentToString()
    }

    private fun arrayFeatures() {
        val tempArray = arrayOf(1, "Sohaib", 923206313745)
        tempArray[1] = "Sohaib Ahmed"
        binding.tvTextMain.text = tempArray.contentToString()

        // Size of Array
        tempArray.size

        // Contain
        val contains = tempArray.contains(1)
        if (contains)
            Toast.makeText(this, "Contains", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "Not Found", Toast.LENGTH_SHORT).show()

        // First & Last
        tempArray.first()
        tempArray.last()

        // Index of
        tempArray.indexOf("Sohaib Ahmed")
    }

    private fun rangeFeatures() {
        for (num in 1..2)
            Log.d(TAG, "rangeFeatures: $num")
        for (ch in 'A'..'B')
            Log.d(TAG, "rangeFeatures: $ch")

        // Check element in Ranges
        val oneToTen = 1..10
        Log.d(TAG, "rangeFeatures: " + (3 in oneToTen))
        Log.d(TAG, "rangeFeatures: " + (31 in oneToTen))

        // Step
        Log.d(TAG, "rangeFeatures: " + oneToTen.step)
        Log.d(TAG, "rangeFeatures: " + oneToTen.step(2))

        // rangeTo() and downTo() functions
        val asc = 1.rangeTo(5)
        val desc = 1.downTo(5)
        Log.d(TAG, "rangeFeatures: $asc")
        Log.d(TAG, "rangeFeatures: $desc")

        // Reverse
        Log.d(TAG, "rangeFeatures: " + oneToTen.reversed())
    }

    private fun whenFeatures() {
        when (val temp = 22) {
            22 -> {
                Log.d(TAG, "whenFeatures: $temp")
            }
            33 -> Log.d(TAG, "whenFeatures: failed")
            37 -> Log.d(TAG, "whenFeatures: failed")
            36 -> Log.d(TAG, "whenFeatures: failed")
            35 -> Log.d(TAG, "whenFeatures: failed")
            34 -> Log.d(TAG, "whenFeatures: failed")
            else -> Log.d(TAG, "whenFeatures: else")
        }

        // when expression with ranges
        when (12) {
            in 1..9 -> Log.d(TAG, "whenFeatures: Single Digit")
            in 10..99 -> Log.d(TAG, "whenFeatures: Double Digits")
            in 100..999 -> Log.d(TAG, "whenFeatures: Tripe Digits")
            else -> Log.d(TAG, "whenFeatures: More Than Tripe Digits")
        }
    }

    private fun forLoopFeature() {
        for (num in 0..10) {
            Log.d(TAG, "loopFeature: $num")
        }
        // for loop iterating though array indices
        val arr = arrayOf('a', 'b', 'c', 'd', 'e')
        for (i in arr.indices) {
            val c = arr[i]
            Log.d(TAG, "loopFeature: $c")
        }

        // for loop with Indices
        for ((x, y) in arr.withIndex()) {
            Log.d(TAG, "loopFeature: $x : $y")
        }
    }

    private fun whileLoopFeature() {
        var total = 10
        while (total > 5) {
            Log.d(TAG, "whileLoopFeature: $total")
            total--
        }
    }

    private fun doWhileLoopFeature() {
        var total = 10
        do {
            Log.d(TAG, "whileLoopFeature: $total")
            total--
        } while (total > 5)
    }

    private fun forEach() {
        val arr = arrayOf(1, 2, 3, 4)
        arr.forEach { num ->
            Log.d(TAG, "forEach: $num")
        }
    }

    private fun continueFeature() {
        for (num in 1..5) {
            Log.d(TAG, "continueFeature: before: $num")
            if (num == 2) {
                continue
            }
            Log.d(TAG, "continueFeature: after: $num")
        }

        // Skipping with label
        firstLoop@ for (x in 'a'..'d') {
            for (y in 1..4) {
                if (y == 2) {
                    continue@firstLoop
                }
                Log.d(TAG, "continueFeature: $x : $y")
            }
        }
    }

    private fun breakFeature() {
        for (num in 1..5) {
            Log.d(TAG, "breakFeature: before: $num")
            if (num == 2) {
                break
            }
            Log.d(TAG, "breakFeature: after: $num")
        }

        // Skipping with label
        firstLoop@ for (x in 'a'..'d') {
            for (y in 1..4) {
                if (y == 2) {
                    break@firstLoop
                }
                Log.d(TAG, "breakFeature: $x : $y")
            }
        }
    }

    /* ------------------------------------------------- Click Listeners ------------------------------------------------- */

    private fun onRandomClick() {
        val random = (0..10).random()
        binding.tvTextMain.text = random.toString()
    }

    private fun onCountClick() {
        n++
        binding.tvTextMain.text = n.toString()
    }

    private fun onToastClick() {
        Toast.makeText(this, "Welcome", Toast.LENGTH_LONG).show()
    }

    private fun onOperationClick() {
        val a = 5
        val b = 3
        val minus = a.minus(b)
        binding.tvTextMain.text = minus.toString()
    }
}
