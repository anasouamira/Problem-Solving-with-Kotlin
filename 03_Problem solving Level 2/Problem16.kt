/*
Problem16 |========================================================

Write a program to print all words from AAA to ZZZ

Output :
AAA
AAB
AAC
...
===============================================================
*/

// ===========================================================
// Example 1 — Classic C++ Style Logic
// ===========================================================

/**
 * Prints all combinations from AAA to ZZZ using nested loops
 * and ASCII conversion (mirroring C++ approach).
 */
fun printAllWordsClassic() {
    println("--- Classic Approach ---")
    for (i in 65..90) { // First character 'A'..'Z'
        for (j in 65..90) { // Second character 'A'..'Z'
            for (k in 65..90) { // Third character 'A'..'Z'
                println("${i.toChar()}${j.toChar()}${k.toChar()}")
            }
        }
    }
}

// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================

/**
 * Prints all combinations from AAA to ZZZ using Kotlin Char ranges.
 */
fun printAllWordsOptimized() {
    println("--- Optimized Kotlin Approach ---")
    ('A'..'Z').forEach { first ->
        ('A'..'Z').forEach { second ->
            ('A'..'Z').forEach { third ->
                println("$first$second$third")
            }
        }
    }
}

// ===========================================================
// Main Function — Run Both Examples
// ===========================================================
fun main() {
    // Classic approach
    printAllWordsClassic()

    // Optimized Kotlin approach
    printAllWordsOptimized()
}
