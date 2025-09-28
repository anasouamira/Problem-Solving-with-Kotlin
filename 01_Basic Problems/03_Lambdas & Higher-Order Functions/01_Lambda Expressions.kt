
fun main() {
 
// ===== Exercise 1 – Double Number (lambda) =====
val double: (Int) -> Int = { x: Int -> x * 2 }
fun exercise1() {
    println(double(5)) // should print 10
}

// ===== Exercise 2 – Greeting Lambda =====
val greet: (String) -> Unit = { name: String -> println("Hello $name") }
fun exercise2() {
    greet("Anas") // prints: Hello Anas
}
}
