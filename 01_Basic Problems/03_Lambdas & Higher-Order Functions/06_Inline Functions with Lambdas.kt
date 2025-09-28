

fun main() {
    // ===== Exercise 8 – Inline measureTime =====
inline fun measureTime(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    println("Elapsed: ${end - start} ms")
}
fun exercise8() {
    measureTime {
        // simple work to measure
        var s = 0L
        for (i in 1..1_000_000) s += i
        println("Work done, sum = $s")
    }
}

// ===== Exercise 9 – inline + noinline example =====
inline fun process(noinline block: () -> Unit) {
    // we can store the noinline lambda in a variable and call it later
    val stored = block
    println("Before calling stored block")
    stored()
    println("After calling stored block")
}
fun exercise9() {
    process {
        println("This is the block body")
    }
}
}
