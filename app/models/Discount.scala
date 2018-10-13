package models

import models.price.Price

trait Discount {
  def apply(f: => Int, order: Order, discountAmount: Price): Price
}
