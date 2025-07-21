package lesson_14

class Wolf(
    name: String,
    type: String,
    weight: Int,
) : Animal(name, type, weight, isWild = true) {
}