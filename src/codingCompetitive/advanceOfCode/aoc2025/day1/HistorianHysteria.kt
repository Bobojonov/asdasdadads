package codingCompetitive.advanceOfCode.aoc2025.day1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Collections.sort
import kotlin.math.abs

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val arr1 = mutableListOf<Int>()
    val arr2 = mutableListOf<Int>()
    var i = 0
    while (true) {
        val str = reader.readLine()
        if (str.isNullOrBlank()) break  // Stop if input is empty

        val split = str.split("   ")
        arr1.add(split[0].toInt())
        arr2.add(split[1].toInt())
    }
    sort(arr1)
    sort(arr2)
    var distance = 0
    for (j in arr1.indices) {
        distance += abs(arr1[j] - arr2[j])
    }
    println(distance)
    reader.close()
}