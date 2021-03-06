package bridge

case class BigWheel(product: Product, s: String) extends Car(product, s) {

  override def assemble: Unit = println(s"Assembling product ${product.productName} for $s")

  override def produceProduct: Unit = {
    product.produce // this allows changes to future products, now you don't have to change BigWheel if that occurs.
    println(s"Modifying product ${product.productName} according to $s")
  }

  override def printDetails: Unit = println(s"Car: $s   Product: ${product.productName}")
}
