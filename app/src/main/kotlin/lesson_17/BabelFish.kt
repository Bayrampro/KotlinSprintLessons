package lesson_17

class BabelFish(
    val coff: Int?
) {
    var isTranslated = false

    var nerveSignal: Int = 200
        get() = if (coff != null) field * coff else field
        set(value: Int) {
            field = value
            if (value > 300) {
                isTranslated = true
                println("isTranslated = true")
            }
        }
}