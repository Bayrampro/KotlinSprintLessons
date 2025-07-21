package lesson_11_12


class Dish (
    val id: Int,
    val name: String,
    val category: String,
    val ingredients: List<String>,
    var isFavorite: Boolean = false,
) {
    fun addToFavorites() {
        println("Ingredient $name added to favorites")
        isFavorite = true
    }

    fun removeFromFavorites() {
        println("Ingredient $name removed from favorites")
        isFavorite = false
    }

    fun startCooking() {
        println("User started to cooking $name")
    }

    fun downloadIngredients() : List<String> {
        println("Ingredients of $name downloaded successfully!")
        return ingredients
    }
}