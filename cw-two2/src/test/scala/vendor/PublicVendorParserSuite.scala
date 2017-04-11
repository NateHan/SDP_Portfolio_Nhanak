package vendor

import factory.VirtualMachineFactory
import org.scalatest.{FunSuite, Ignore}

class PublicVendorParserSuite extends FunSuite {
  val vp = VirtualMachineFactory.vendorParser

  test("[3] vendor parser should parse a program string correctly") {
    val insts = vp.parseString("iconst 4\niconst 5\niadd\nprint")
    assert(insts.length == 4)
  }

  test("[4] vendor parser should parse a program file correctly") {
    val insts = vp.parse("programs/p03.vm")
    assert(insts.length == 20)

    val all = Vector("iconst", "iconst", "iswap", "iadd", "iconst", "iadd",
      "iconst", "isub", "iconst", "imul", "iconst", "idiv",
      "iconst", "irem", "ineg", "idec", "iinc", "idup", "print", "print")
    for (i <- insts.indices) {
      assert(insts(i).name == all(i))
    }
  }


  test("[6] vendor parser should create iconst instructions with non empty arguments  "){
    val instVector = vp.parseString("iconst 12")
    val inst = instVector(0)
    assert(inst.name == "iconst")
    assert(inst.args.nonEmpty)
    assert(inst.args(0) == 12)
  }
}