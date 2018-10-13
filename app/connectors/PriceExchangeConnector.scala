package connectors

import javax.inject.Inject
import models.price.Price
import play.api.libs.ws.WSClient

@Singleton()
class PriceExchangeConnector @Inject()(wsGet: WSClient){
  def baseUrl: String = ""

  def urlBuilder(from: Price, to: Price, amount: Double): String = ???
}
