package models

import models.price.Price
import play.api.libs.json.{Format, Json}

case class Order(meals: List[Meal], isDone: Boolean, discounts: List[Discount], phoneNumber: String) {
  def total: Price = ???
}

object Order {
  implicit def format: Format[Order] = Json.format[Order]
}