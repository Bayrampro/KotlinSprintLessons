package lesson_11_12


// Class with default constructor and secondary constructor
class Ingredient(
    val name: String,
    val weight: Int,
    val count: Int,
) {
    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {
        this.isNeedToPrepare = isNeedToPrepare
    }

    init {
        println("Ingredient is created!")
    }
}

// Class with primary constructor
//class Ingredient (_name: String, _weight: Int, _count: Int, _isNeedToPrepare: Boolean) {
//    val name = _name
//    val weight = _weight
//    var isNeedToPrepare = _isNeedToPrepare
//
//    init {
//        println("Ingredient is created!")
//    }
//}




