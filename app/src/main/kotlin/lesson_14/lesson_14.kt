package lesson_14

fun main() {
    val wolf: Wolf = Wolf(name = "Серый волк", type = "сухопутный", weight = 70)
    wolf.eat()
    wolf.jump()
    wolf.makeNoise(noise = "RRRRRRRR")

    val cow: Cow = Cow(name = "Булька Барабулька", type = "сухопутный", weight = 400)
    cow.eat()
    cow.jump()
    cow.makeNoise(noise = "MOOOOOOOOOO...MOOOOOOO")
}