package ficode.truthtable

object TruthTable  {
  def and(op1:Boolean,op2:Boolean):Boolean=op1 && op2
  def or(op1:Boolean,op2:Boolean) :Boolean= op1 || op2
  def nand(op1:Boolean,op2:Boolean) : Boolean = !op1 || !op2
  def nor(op1:Boolean,op2:Boolean) : Boolean = !(op1 || op2)
  def xor(op1:Boolean,op2:Boolean) : Boolean= (op1 ^ op2)
}
