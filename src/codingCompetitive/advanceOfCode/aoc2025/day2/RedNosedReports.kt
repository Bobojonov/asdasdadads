package codingCompetitive.advanceOfCode.aoc2025.day2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import java.util.Collections.sort

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    var counter = 0
    while (true) {
        val arr = mutableListOf<Int>()
        val str = reader.readLine()
        if (str.isNullOrBlank()) break
        val split = str.split(" ")
        for (i in split.indices) arr.add(split[i].toInt())
        val incOrDec = arr[0] <= arr[1]
        var available = true
        for (i in 0 .. arr.size - 2) {
            if (arr[i] < arr[i + 1] && incOrDec) {
                val diff = arr[i + 1] - arr[i]
                if (diff in 1..3) continue
                else {
                    available = false
                    break
                }
            }
            if (arr[i] > arr[i + 1] && !incOrDec) {
                val diff = arr[i] - arr[i + 1]
                if (diff in 1..3) continue
                else {
                    available = false
                    break
                }
            } else {
                available = false
                break
            }
        }
        if (available) counter++
    }
    println(counter)
    reader.close()
}