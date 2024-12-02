package br.com.le.y2024

import kotlin.math.abs

class Day1 {

    fun part1(input: List<String>): Int {
        fun Pair<List<Int>, List<Int>>.sorted() = first.sorted().zip(second.sorted())

        val lineList = toLineList(input)
        return lineList.sorted().sumOf { (left, right) -> abs(left - right) }
    }


    fun part2(input: List<String>): Int {
        val (left, right) = toLineList(input)
        return left.toSet().sumOf { l -> l * right.count { l == it} }
    }

    private fun toLineList(input: List<String>) : Pair<List<Int>, List<Int>> = input.map { line ->
            val (left, right) = line.split("   ")
            left.toInt() to right.toInt()
    }.unzip()




}