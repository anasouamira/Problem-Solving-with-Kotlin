fun main() {
   // Exercise 4 – Default Parameter
fun welcome(name: String = "Guest") {
    println("Welcome, $name")
}

// Exercise 5 – Named Arguments
fun describePerson(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

// Exercise 6 – Vararg
fun printAll(vararg numbers: Int) {
    for (n in numbers) print("$n ")
    println()
}
}
