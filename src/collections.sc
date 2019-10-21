val numbers = List(1, 2, 3, 4)

Set(1, 2, 3,3, 3)
//set не сод-т один. элементов

//кортеж
val hostPort = ("localhost", 90, 0, "ss", 0)
hostPort._2

//карты
Map(1-> 2)
Map("sss"-> "dd") //создали кортеж
Map(1-> "one")
Map(1 -> Map("foo" -> "bar"))

//опция
//trait Option[T] { def isDefined: Boolean def get: T def getOrElse(t: T): T }
val numbers = Map("one" -> 1, "two" -> 2)


val nestedNumbers = List(List(1, 2), List(3, 4))

nestedNumbers.flatMap(x => x.map(_ * 2))

def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
  numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
    fn(x) :: xs
  }
}
val nus = List(1,2,3,4,5,6,7,8,9)
def timesTwo(i: Int): Int = i * 2
ourMap(nus, timesTwo(_))

val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)
extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)
extensions.filter({case (name, extension) => extension < 200})
