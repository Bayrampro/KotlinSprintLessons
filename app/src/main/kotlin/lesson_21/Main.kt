package lesson_21

import java.io.File

val File.nameWithoutExtension: String
    get() = name.substringBeforeLast(".")

fun main() {
    val file = File("textFile.txt")
    file.writeToFileAndSend()
    println(file.nameWithoutExtension)
}

fun File.writeToFileAndSend() {
    val message = "Some message to file"
    createNewFile()
    writeText(message)
    println("message: \"$message\" from file: $name")
}