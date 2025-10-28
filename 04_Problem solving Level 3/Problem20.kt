/*
Problem20 |===============================================

Write a program to print random Small letter, Capital Letter,
Special character, and Digit order

Output :
i
G
$
7

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

// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================
fun getRandomCharacterOptimized(type: CharType): Char {
    return when(type) {
        CharType.SmallLetter -> ('a'..'z').random()
        CharType.CapitalLetter -> ('A'..'Z').random()
        CharType.SpecialCharacter -> listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=').random()
        CharType.Digit -> ('0'..'9').random()
    }
}

// ===========================================================
// Main Function
// ===========================================================
fun main() {
    println("--- Classic Approach ---")
    println(getRandomCharacterClassic(CharType.SmallLetter))
    println(getRandomCharacterClassic(CharType.CapitalLetter))
    println(getRandomCharacterClassic(CharType.SpecialCharacter))
    println(getRandomCharacterClassic(CharType.Digit))

    println("\n--- Optimized Kotlin Approach ---")
    println(getRandomCharacterOptimized(CharType.SmallLetter))
    println(getRandomCharacterOptimized(CharType.CapitalLetter))
    println(getRandomCharacterOptimized(CharType.SpecialCharacter))
    println(getRandomCharacterOptimized(CharType.Digit))
}
