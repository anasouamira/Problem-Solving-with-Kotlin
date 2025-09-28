
fun main() {
 // ===== Exercise 7 – Closure: makeCounter =====
fun makeCounter(): () -> Int {
    var count = 0
    return {
        count += 1
        count
    }
}
fun exercise7() {
    val counter = makeCounter()
    println(counter()) // 1
    println(counter()) // 2
    println(counter()) // 3
}
}
