/*
Problem21 |===============================================

Write a program to read how many keys to generate and print
them on the screen.

Input:
5

Output:

Key [1]: ETAT-HJUV-PEIP-CFRX
Key [2]: UMCO-YSPQ-PHYK-STIL
...
==========================================================
*/

import kotlin.random.Random

// ===========================================================
// Example 1 — Classic C++ Style Translation
// ===========================================================
enum class CharType { SmallLetter, CapitalLetter, SpecialCharacter, Digit }

fun randomNumberClassic(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

fun getRandomCharacterClassic(type: CharType): Char {
    return when(type) {
        CharType.SmallLetter -> randomNumberClassic(97, 122).toChar()
        CharType.CapitalLetter -> randomNumberClassic(65, 90).toChar()
        CharType.SpecialCharacter -> randomNumberClassic(33, 47).toChar()
        CharType.Digit -> randomNumberClassic(48, 57).toChar()
    }
}

fun generateWordClassic(type: CharType, length: Int): String {
    var word = ""
    repeat(length) {
        word += getRandomCharacterClassic(type)
    }
    return word
}

fun generateKeyClassic(): String {
    return "${generateWordClassic(CharType.CapitalLetter,4)}-" +
           "${generateWordClassic(CharType.CapitalLetter,4)}-" +
           "${generateWordClassic(CharType.CapitalLetter,4)}-" +
           "${generateWordClassic(CharType.CapitalLetter,4)}"
}

fun generateKeysClassic(count: Int) {
    for (i in 1..count) {
        println("Key [$i]: ${generateKeyClassic()}")
    }
}

// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================
fun generateKeyOptimized(): String {
    val letters = ('A'..'Z').toList()
    return (1..4).joinToString("-") { 
        (1..4).map { letters.random() }.joinToString("")
    }
}

fun generateKeysOptimized(count: Int) {
    for (i in 1..count) {
        println("Key [$i]: ${generateKeyOptimized()}")
    }
}

// ===========================================================
// Main Function
// ===========================================================
fun main() {
    print("Please enter how many keys to generate? ")
    val count = readLine()?.toIntOrNull() ?: 0
    if (count <= 0) return

    println("\n--- Classic Approach ---")
    generateKeysClassic(count)

    println("\n--- Optimized Kotlin Approach ---")
    generateKeysOptimized(count)
}
