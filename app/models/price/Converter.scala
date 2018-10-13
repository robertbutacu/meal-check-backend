package models.price

trait Converter[P, PP] {
  def convertTo(input: P): PP
  def firstToString: String
  def secondToString: String
}

object Converter {
  implicit def dollarToEuroConverter: Converter[Dollar, Euro] = new Converter[Dollar, Euro] {
    override def convertTo(input: Dollar): Euro = ???

    override def firstToString: String = "USD"

    override def secondToString: String = "EUR"
  }

  implicit def dollarToPoundConverter: Converter[Dollar, Pound] = new Converter[Dollar, Pound] {
    override def convertTo(input: Dollar): Pound = ???

    override def firstToString: String = "USD"

    override def secondToString: String = ???
  }

  implicit def dollarToLeiConverter: Converter[Dollar, Lei] = new Converter[Dollar, Lei] {
    override def convertTo(input: Dollar): Lei = ???

    override def firstToString: String = "USD"

    override def secondToString: String = "LEI"
  }

  implicit def euroToDollarConverter: Converter[Euro, Dollar] = new Converter[Euro, Dollar] {
    override def convertTo(input: Euro): Dollar = ???

    override def firstToString: String = "EUR"

    override def secondToString: String = "USD"
  }

  implicit def euroToPoundConverter: Converter[Euro, Pound] = new Converter[Euro, Pound] {
    override def convertTo(input: Euro): Pound = ???

    override def firstToString: String = "EUR"

    override def secondToString: String = "GBR"
  }

  implicit def euroToLeiConverter: Converter[Euro, Lei] = new Converter[Euro, Lei] {
    override def convertTo(input: Euro): Lei = ???

    override def firstToString: String = "EUR"

    override def secondToString: String = "LEI"
  }

  implicit def leiToEuroConverter: Converter[Lei, Euro] = new Converter[Lei, Euro] {
    override def convertTo(input: Lei): Euro = ???

    override def firstToString: String = "LEI"

    override def secondToString: String = "EUR"
  }

  implicit def leiToPoundConverter: Converter[Lei, Pound] = new Converter[Lei, Pound] {
    override def convertTo(input: Lei): Pound = ???

    override def firstToString: String = "LEI"

    override def secondToString: String = "GBR"
  }

  implicit def leiToDollarConverter: Converter[Lei, Dollar] = new Converter[Lei, Dollar] {
    override def convertTo(input: Lei): Dollar = ???

    override def firstToString: String = "LEI"

    override def secondToString: String = "USD"
  }

}


