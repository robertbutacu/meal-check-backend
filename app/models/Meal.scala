package models

import models.ingredients.Ingredient
import models.price.Price

case class Meal(name: String,
                ingredients: List[Ingredient],
                excludedIngredients: List[Ingredient],
                price: Price,
                discountPercentage: Discount)