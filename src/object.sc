object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}
Timer.currentCount()


object addOne extends Function1[Int, Int]{
  def apply(m : Int): Int = m +1
}
class AddOne extends ((Int) => Int){
  def apply(m : Int): Int = m +1
}

addOne(1)
val plusOne = new  AddOne()
plusOne(1)
