package models

import models.price.Price

case class Order(meals: List[Meal], status: Status, discounts: List[Discount]) {
  def total: Price = ???
}