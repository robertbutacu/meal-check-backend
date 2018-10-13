package models

trait Status {
  def performUpdate: Unit
}

case object Ordered extends Status {
  override def performUpdate: Unit = ???
}

case object ReadyToBeCollected extends Status {
  override def performUpdate: Unit = ???
}


