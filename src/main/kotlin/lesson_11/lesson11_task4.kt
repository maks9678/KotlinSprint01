package org.example.lesson_11

class RecipeCategory(
    val burgers:String,
    val desserts:String,
    val pizza:String,
    val fish:String,
){}
class Recipe(){}

class Ingredient(
    var numberOfServings:Int,
    var listIngredients:Array<String>,
    var cookingMethod:String,
){}