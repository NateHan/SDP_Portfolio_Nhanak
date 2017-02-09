package question3

import org.scalatest.FunSuite

/**
  * Created by nathanhanak on 2/9/17.
  */
class Question3Test extends FunSuite {

  test("Calling name on a director returns one string containing its two 'name' fields concatenated") {
    val d = new Director("Steven", "Spielberg", 1946)
    assert(d.name == "Steven Spielberg")
  }

  test("Calling directorsAge returns age of Director of film when film was made") {
    val d = new Director("Ridley", "Scott", 1937)
    val f = new Film("Alien", 1979, 8.5, d)
    assert(f.directorsAge() == 42)
  }

  test("Calling isDirectedBy takes a director for a parameter and returns true or false, accordingly")
  val qt = new Director("Quentin", "Tarantino", 1963)
  val kb = new Film("Kill Bill: Part I", 2003, 8.1, qt)
  val ss = new Director("Steven", "Soderbergh", 1963)
  val oo = new Film("Ocean's Eleven", 2001, 7.8, ss)
  assert(kb.isDirectedBy(qt) == true)
  assert(oo.isDirectedBy(qt) == false)

}
