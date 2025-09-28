/*
D1 — Simple !! usage
D2 — Demonstrate NPE inside try/catch
D3 — Use !! after check
D4 — Force unwrap return value
D5 — Platform type example (commented)
*/

fun main() {
    // D1
    val s1: String? = "abc"
    println(s1!!.length)

    // D2
    try {
        val s2: String? = null
        println(s2!!.length) // will throw
    } catch (e: Exception) {
        println("caught")
    }

    // D3
    val s3: String? = "hi"
    if (s3 != null) println(s3!!.length) // safe but redundant

    // D4
    fun find(): String? = "sure"
    val r = find()!! // assume not null
    println(r)

    // D5 — Example of platform type:
    // val jResult: String? = "fromJava"
    // println(jResult!!.length) // acceptable if sure not null
}
