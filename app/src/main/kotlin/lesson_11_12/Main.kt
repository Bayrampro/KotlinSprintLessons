package lesson_11_12

fun  main() {
    val dish1: Dish = Dish(
        id = 1,
        name = "Palow",
        category = "Turkmen meals",
        ingredients = listOf("Rice", "Carrot", "Salt", "Meat")
    )

    val dish2: Dish = Dish(
        id = 2,
        name = "Potato with meat",
        category = "International meals",
        ingredients = listOf("Potato", "Tomato", "Egg", "Meat", "Salt")
    )

    val ingredient: Ingredient = Ingredient(name = "Potato", weight = 30, count = 4, isNeedToPrepare = true)

    println(ingredient.name)
    println(ingredient.weight)
    println(ingredient.isNeedToPrepare)


//    dish1.addToFavorites()
//    dish1.removeFromFavorites()
//    dish1.startCooking()
//    println(dish1.downloadIngredients())
//
//    dish2.addToFavorites()
//    dish2.removeFromFavorites()
//    dish2.startCooking()
//    println(dish2.downloadIngredients())
}

