package org.example.app.lessons_1_10

fun main() {
    val a = 10
    val b = 3

    println(a / b)

    val int1: Int = 10
    val int2: Int = 3

    println(int1 / int2)

    val float1: Float = 10f
    val float2: Float = 3f

    println(float1 / float2)

    val double1: Double = 10.0
    val double2: Double = 3.0

    println(double1 / double2)

    println(int1::class.java.simpleName)
    println(double1::class.java.simpleName)
    println(float1::class.java.simpleName)
}