package testingExercise

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

/**
  * Created by nathanhanak on 2/10/17.
  */
class PizzaTests extends FunSuite with BeforeAndAfter {

  var pizza: Pizza = _

  before {
    pizza = new Pizza
  }

  test("new pizza has zero toppings") {
    assert(pizza.getToppings.size == 0)
  }

  test("adding one topping") {
    pizza.addTopping(Topping("green olives"))
    assert(pizza.getToppings.size === 1)
  }

  // mark that you want a test here in the future
  test ("test pizza pricing") (pending)

}
