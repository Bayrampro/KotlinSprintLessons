package org.example.app.lessons_1_10

fun main() {
    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    val charArray: CharArray = charArrayOf('a', 'b', 'b', 'c')
    val stringArray: Array<String> = arrayOf("apple", "banana", "paprika", "juice", "strawberry")

    println(stringArray.indexOf("banana"))
    println(stringArray[4])

    stringArray[3] = "onion"

    stringArray.set(1, "ukrop")
    stringArray.get(1)

    for (i in stringArray) {
        println("Ingredient ${stringArray.indexOf(i) + 1}: $i")
    }
}