package com.example.firstapplication.activities

import android.util.Log
import com.example.firstapplication.utils.TAG

class CollectionsFeatures {

    init {
        immutableCollections()
        mutableCollections()
    }

    /* -------------------------------------- Immutable Collection -------------------------------------- */

    private fun immutableCollections() {
        cList()
        cListAngle()
        cSetOf()
        cMapOf()
    }

    private fun cSetOf() {
        val setOf = setOf(1, 2, 3, 3)
        setOf.forEach { Log.d(TAG, "cSetOf: $it") }
    }

    private fun cList() {
        val listOf = listOf("asd", 2, true)
        for (temp in listOf) {
            Log.d(TAG, "cList: $temp")
        }
    }

    private fun cListAngle() {
        val listOf: List<Int> = listOf<Int>(1, 2, 3)
        for (_list in listOf)
            Log.d(TAG, "cListAngle: $_list")
    }

    private fun cMapOf() {
        val mapOf = mapOf(1 to "asd", 2 to "pro")
        for (entry in mapOf) {
            Log.d(TAG, "cMapOf: $entry")
        }
    }

    /* -------------------------------------- Mutable Collection -------------------------------------- */

    private fun mutableCollections() {
        cMutableListOf()
        cArrayList()
        cMutableSetOf()
        cMutableMapOf()
    }

    private fun cMutableSetOf() {
        val mutableListOf = mutableListOf(1, 2, 3)
        mutableListOf.add(3)
        for (i in mutableListOf) {
            Log.d(TAG, "cMutableSetOf: $i")
        }
    }

    private fun cMutableListOf() {
        val mutableListOf = mutableListOf(1, 2, 3, 4)
        mutableListOf.add(5)
        mutableListOf.removeAt(2)
        mutableListOf.add(2, 9)
        mutableListOf.retainAll(mutableListOf(1, 2))
        mutableListOf.forEach {
            Log.d(TAG, "cMutableListOf: $it")
        }
    }

    private fun cArrayList() {
        val arrayList = ArrayList<String>()
        arrayList.add("abc")
        arrayList.add("cde")
        arrayList.remove("abc")
        arrayList.forEach {
            Log.d(TAG, "cArrayListOf: $it")
        }

        val genericArrayList = ArrayList<Int>()
        genericArrayList.add(1)
        genericArrayList.add(2)
        genericArrayList.add(3)

        genericArrayList.forEach {
            Log.d(TAG, "dynamicArrayList: $it")
        }
    }

    private fun cMutableMapOf() {
        val mutableMapOf = mutableMapOf(1 to "A", 2 to "B")
        mutableMapOf[3] = "C"
        mutableMapOf.forEach { (i, s) -> Log.d(TAG, "cMutableMapOf: $i = $s") }
    }
}
