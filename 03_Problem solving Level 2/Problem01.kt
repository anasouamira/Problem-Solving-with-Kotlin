// 🔹 Question / Task:
// Print the multiplication table from 1 to 10 in a tabular form.
// Provide two versions:
// - Example 1: Direct translation that preserves the original C++ methodology/structure.
// - Example 2: A more professional / idiomatic Kotlin version with improved alignment.

// -----------------------------------------------------------
// Example 1 — Direct translation of the C++ methodology
// -----------------------------------------------------------

/*
  Notes:
  - Keep the same function names and structure as the C++ code:
    PrintTableHeader(), ColumnSeparator(), PrintMultiplicationTable(), main()
  - Use \t (tabs) for spacing like the original.
  - All explanatory comments are in English (as requested).
*/

fun PrintTableHeader() {
    println("\n\n\t\t\t Multiplication Table From 1 to 10\n")
    print("\t")
    for (i in 1..10) {
        print("$i\t")
    }
    println()
    println("___________________________________________________________________________________")
}

fun ColumnSeparator(i: Int): String {
    // Return a separator string similar to the original C++ logic.
    // This keeps the visual alignment approach used before.
    return if (i < 10) "   |" else "  |"
}

fun PrintMultiplicationTable() {
    PrintTableHeader()
    for (i in 1..10) {
        // Print row label and separator, then the row values separated by tabs.
        print(" $i${ColumnSeparator(i)}\t")
        for (j in 1..10) {
            print("${i * j}\t")
        }
        println()
    }
}

// -----------------------------------------------------------
// Example 2 — Professional / idiomatic Kotlin version
// -----------------------------------------------------------

/*
  Improvements in Example 2:
  - Use fixed column widths and String.padStart to guarantee alignment regardless of number width.
  - Make header generation and separator dynamic but still produce a neat table like the sample.
  - Keep code concise and readable while improving output alignment.
*/

fun printTableHeaderProfessional(size: Int, cellWidth: Int) {
    // Title centered roughly for console output (simple approach).
    println("\n\n${"Multiplication Table From 1 to $size".padStart((size * cellWidth) / 2 + 10)}\n")
    // Print top header row (numbers 1..size)
    print(" ".repeat(cellWidth)) // space for the row labels column
    for (i in 1..size) {
        print(i.toString().padStart(cellWidth))
    }
    println()
    // Print a separator line based on table width
    println("-".repeat(cellWidth * (size + 1)))
}

fun printMultiplicationTableProfessional(size: Int = 10) {
    val cellWidth = 6 // fixed width for each column (adjust for larger tables)
    printTableHeaderProfessional(size, cellWidth)

    for (i in 1..size) {
        // Row label (left column) with separator
        val rowLabel = i.toString().padStart(3)
        print("$rowLabel |")
        // Print each cell with fixed width for alignment (right-aligned numbers)
        for (j in 1..size) {
            val value = (i * j).toString().padStart(cellWidth - 1)
            print(value)
        }
        println()
    }
}

// -----------------------------------------------------------
// Main — run both examples
// -----------------------------------------------------------

fun main() {
    // Example 1: Classic style that mirrors the original C++ code structure
    println("=== Example 1: Classic style ===")
    PrintMultiplicationTable()

    // Example 2: Professional, idiomatic Kotlin version with improved alignment
    println("\n=== Example 2: Professional Kotlin style ===")
    printMultiplicationTableProfessional(10)
}
