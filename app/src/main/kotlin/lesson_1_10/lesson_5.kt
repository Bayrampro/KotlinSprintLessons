package org.example.app.lessons_1_10

fun main() {
    val userAge = readln().toInt()

    val result = when(userAge) {
        10 -> {
            println("First line done!")
            "You are small boy!"
        }
        30 -> "You are solid man!"
        45 -> "Retirement is soon!"
        65 -> "Oh my god!"
        else -> "Nothing to match"
    }

    println(result)
}