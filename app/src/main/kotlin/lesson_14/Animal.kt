package lesson_14

abstract class Animal(
    val name: String,
    val type: String,
    val weight: Int,
    val isWild: Boolean = false
) {
    fun makeNoise(noise: String) {
        println("$name says a $noise")
    }

    fun eat() {
        println("$name eat...")
    }

    open fun jump() {
        println("$name jump...")
    }
}