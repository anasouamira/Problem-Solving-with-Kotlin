

fun main() {
    // ===== Exercise 4 – Apply Twice (passing function) =====
fun applyTwice(f: (Int) -> Int, x: Int): Int {
    return f(f(x))
}
fun exercise4() {
    println(applyTwice({ it + 3 }, 4)) // (4+3)+3 = 10
}
}
