package bridge

case class CentralLocking(s: String) extends Product {

  override def productName: String = s

  override def produce: Unit = println(s"Producing a $s")
}
