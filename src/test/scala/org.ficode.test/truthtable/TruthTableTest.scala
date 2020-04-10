package org.ficode.test.truthtable

import org.scalatest.FunSuite
import ficode.truthtable.TruthTable
class TruthTableTest extends FunSuite {

  val tt = TruthTable
  test("TruthTable and"){
    assert(tt.and(true,true))
    assert(!tt.and(true,false))
    assert(!tt.and(false,true))
    assert(!tt.and(false,false))
  }

  test("TruthTable or"){
    assert(tt.or(true,true))
    assert(tt.or(true,false))
    assert(tt.or(false,true))
    assert(!tt.or(false,false))
  }

  test("TruthTable nand"){
    assert(!tt.nand(true,true))
    assert(tt.nand(true,false))
    assert(tt.nand(false,true))
    assert(tt.nand(false,false))
  }

  test("TruthTable nor"){
    assert(!tt.nor(true,true))
      assert(!tt.nor(true,false))
      assert(!tt.nor(false,true))
      assert(tt.nor(false,false))
  }
  test("TruthTable xor "){
    assert(!tt.xor(true,true))
    assert(!tt.xor(false,false))
    assert(tt.xor(true,false))
    assert(tt.xor(false,true))
  }


}
