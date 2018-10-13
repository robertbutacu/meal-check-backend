package models

import models.price.Price
import play.api.libs.json.{Format, Json}

case class Meal(name: String,
                ingredients: List[String],
                excludedIngredients: List[String],
                price: Price,
                discountPercentage: Discount)

object Meal {
  implicit def format: Format[Meal] = Json.format[Meal]
}