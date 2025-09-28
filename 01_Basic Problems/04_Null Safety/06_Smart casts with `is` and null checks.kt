/*
F1 — is type check
F2 — is with else branch
F3 — Nullable Any? + is and null check
F4 — when with is and smart-cast
F5 — Smart casts inside lambda after null-safe let
*/

fun main() {
    // F1
    val x1: Any = "hello"
    if (x1 is String) println(x1.length)

    // F2
    val x2: Any = 5
    if (x2 is Int) println(x2 + 1) else println("not int")

    // F3
    val y: Any? = "s"
    if (y != null && y is String) println(y.length)

    // F4
    val v: Any = "abc"
    when (v) {
        is String -> println(v.length)
        is Int -> println(v + 1)
        else -> println("other")
    }

    // F5
    val obj: Any? = "K"
    obj?.let { if (it is String) println(it.lowercase()) }
}
