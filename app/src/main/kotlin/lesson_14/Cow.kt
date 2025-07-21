package lesson_14

class Cow(
    name: String,
    type: String,
    weight: Int,
) : Animal(name, type, weight) {

    override fun jump() {
        println("cow named $name can't jump at all! :(")
    }
}