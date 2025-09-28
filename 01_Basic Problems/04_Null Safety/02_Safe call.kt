/*
B1 — Safe call for length
B2 — Chain safe calls
B3 — Call method on nullable object with let
B4 — Safe-call with array of nullable items
B5 — Nullable receiver extension + safe call
*/

fun main() {
    // B1
    val s1: String? = null
    println(s1?.length) // null

    // B2
    val s2: String? = "kotlin"
    println(s2?.uppercase()?.length) // 6

    // B3
    val fileName: String? = null
    fileName?.let { println(it.length) } // won't run

    // B4
    val arr: Array<String?> = arrayOf("one", null)
    println(arr[1]?.uppercase()) // null

    // B5
    fun String?.firstOrDash(): String = this?.first()?.toString() ?: "-"
    println((null as String?).firstOrDash()) // "-"
    println("Hi".firstOrDash()) // "H"
}
