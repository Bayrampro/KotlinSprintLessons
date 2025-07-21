package org.example.app.lessons_1_10

fun main() {
    printInfo(getName(), getAge())
}


fun getName(): String? {
    println("Введите имя:")
    return readLine()
}

fun getAge(): Int? {
    println("Введите возраст")
    return  readLine()?.toInt()
}

fun printInfo(name: String?, age: Int?) {
    println("Ваше имя и возраст: $name, $age")
}