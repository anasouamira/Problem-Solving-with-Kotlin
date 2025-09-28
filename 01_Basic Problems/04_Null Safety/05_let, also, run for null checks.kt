/*
E1 — let on nullable
E2 — also for side-effect and chain
E3 — run to compute a value when not-null
E4 — Chain also + let
E5 — Use let to transform and return
*/

fun main() {
    // E1
    val s1: String? = "hi"
    s1?.let { println(it.length) }

    // E2
    var name: String? = "bob"
    name?.also { println("logging $it") }
    println(name)

    // E3
    val s3: String? = "abc"
    val length = s3?.run { length } ?: 0
    println(length)

    // E4
    val s4: String? = "k"
    s4?.also { println("seen $it") }?.let { println(it.length) }

    // E5
    val maybeNumber: String? = "42"
    val n = maybeNumber?.let { it.toInt() } ?: -1
    println(n)
}
