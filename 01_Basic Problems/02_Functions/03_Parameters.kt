fun main() {
    // ===========================================
    // 1️⃣ Default Parameters
    // - You can assign default values to parameters
    // - If no argument is passed, the default value is used
    // ===========================================
    fun greet(name: String = "Guest") {
        println("Hello, $name!")
    }

    greet("Alice") // prints: Hello, Alice!
    greet()        // prints: Hello, Guest! (default value used)

    // ===========================================
    // 2️⃣ Named Parameters
    // - You can specify which argument goes to which parameter using the parameter name
    // - Useful when a function has multiple parameters
    // ===========================================
    fun introduce(name: String, age: Int, city: String) {
        println("My name is $name, I'm $age years old, and I live in $city.")
    }

    introduce(name = "Bob", age = 25, city = "Paris")
    // You can change the order when using named parameters
    introduce(city = "Berlin", name = "Eva", age = 30)

    // ===========================================
    // 3️⃣ Vararg Parameters
    // - Allows a function to accept a variable number of arguments
    // - Must be the last parameter in the function definition
    // ===========================================
    fun sumAll(vararg numbers: Int): Int {
        var sum = 0
        for (n in numbers) {
            sum += n
        }
        return sum
    }

    val total1 = sumAll(1, 2, 3, 4)
    println("Total sum: $total1") // prints 10

    val total2 = sumAll(5, 10, 15)
    println("Total sum: $total2") // prints 30

    // ===========================================
    // 4️⃣ Summary
    // - Default parameters: provide default values for optional arguments
    // - Named parameters: pass arguments using parameter names, can change order
    // - Vararg parameters: accept multiple arguments as a single array
    // ===========================================
}
