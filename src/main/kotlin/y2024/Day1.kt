package br.com.le.y2024

import kotlin.math.abs

class Day1 {

    fun part1(input: List<String>): Int {
        val (left, right) = extracted(input)

        val values = left.mapIndexed { index, it ->
            abs(it - right[index])
        }

        return values.sum()
    }

    fun part2(input: List<String>): Int {
        val (left, right) = extracted(input)

        val leftSet = left.toSet()

        val res = leftSet.map { l -> l * right.count { l == it} }.toList()
        return res.sum()
    }

    private fun extracted(input: List<String>) : Pair<List<Int>, List<Int>> {
        val left = mutableListOf<Int>()
        val right = mutableListOf<Int>()

        for(item in input) {
            val (l, r) = item.split("   ")
            left.add(l.toInt())
            right.add(r.toInt())
        }

        return left.sorted() to right.sorted()
    }



}