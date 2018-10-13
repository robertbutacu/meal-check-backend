package connectors

import models.price.Converter

trait PriceExchange {
  def convert[P1, P2](from: P1, to: P2, amount: Double)(implicit priceConverter: Converter[P1, P2]): P2
}
