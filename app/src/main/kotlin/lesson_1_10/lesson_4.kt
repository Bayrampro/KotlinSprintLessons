package org.example.app.lessons_1_10

fun main() {
    val userAge = 19
    val isOk: Boolean = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE

    if (isOk) {
        println("You are fucking good man!")
    } else {
        println("You are not passed dumb bitch")
    }
}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65