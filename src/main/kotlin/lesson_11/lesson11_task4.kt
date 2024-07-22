package org.example.lesson_11

class RecipeCategory(
    val nameCategory: String,
    val categoryDescription: String,
) {
    var dishIsCategory: MutableList<Recipe> = mutableListOf()
    fun addDishInCategory(dish: Recipe) {
        dishIsCategory.add(dish)
    }
}

class Recipe(
    val nameDish: String,
    val ingredientOfDish: Ingredient,
    val cookingMethod: String,
    var numberOfServings: Int,
    var isChosen: Boolean = false,
) {}

class Ingredient(
    val nameDish: String,
    val listNameIngredients: Array<String>,
    var numberOfIngredients: Array<Int>,
    val quantityCharacteristics: Array<String>,
) {
    fun counterIngredient(numberOfServings: Int) {
        numberOfIngredients.forEach { it * numberOfServings }
    }
}