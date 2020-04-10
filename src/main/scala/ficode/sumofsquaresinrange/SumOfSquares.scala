package ficode.sumofsquaresinrange

object SumOfSquares {

  def square (ls:List[Int]):List[Int] = for(i <- ls) yield(i * i)

  def sumOfSquares(num1:Int,num2:Int):Long={
    if((num1 < num2)){
      val list:List[Int] =(num1 to num2).toList
      square(list).reduceLeft(_ + _)
    }else if(num1 > num2){
      val list2:List[Int] = (num2 to num1).toList
       square(list2).reduceLeft(_ + _)
    }else{
      num1*num1
    }
  }
}
