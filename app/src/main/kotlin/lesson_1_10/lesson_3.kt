package org.example.app.lessons_1_10

fun main() {
    val greeting = "Hello"
    val name = "Bayram"

    println("$greeting, $name! How are you?")

    val multiString = """
        aaaaa
            bbbb
         ccccc   
    """.trimIndent()

    println(multiString)

    val multiString2 = """
                !aaaaa
            !bbbb
         !ccccc   
    """.trimMargin()

    println(multiString2)
}