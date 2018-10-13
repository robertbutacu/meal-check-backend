package models.price

trait Price {
  def amount: Double
}

case class Pound(amount: Double) extends Price

case class Dollar(amount: Double) extends Price

case class Euro(amount: Double) extends Price

case class Lei(amount: Double) extends Price
