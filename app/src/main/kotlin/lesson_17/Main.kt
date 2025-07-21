package lesson_17

fun main() {
    val fish: BabelFish = BabelFish(null)
    println(fish.nerveSignal)
    fish.nerveSignal = 400

    val fish2: BabelFish = BabelFish(4)
    println(fish2.nerveSignal)
    fish2.nerveSignal = 100
}