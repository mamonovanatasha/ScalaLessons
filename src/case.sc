val times = 1

times match {
  case 1 => "one"
  case 2 => "two"
  case _ => "some other number"
}
times match {
  case i if i == 1 => "one"
  case i if i == 2 => "two"
  case _ => "some other number"
}
def bigger(o: Any): Any = {
  o match {
    case i: Int if i < 0 => i - 1
    case i: Int => i + 1
    case d: Double if d < 0.0 => d - 0.1
    case d: Double => d + 0.1
    case text: String => text + "s"
  }
}
bigger(0)
bigger("ss+")

case class Calculator(brand: String, model : String)
val a = Calculator("HP", "20b")
val b = Calculator("HP", "20")
a == b

val hp20b = Calculator("HP", "20B")
val hp30b = Calculator("HP", "30B")

def calcType(calc: Calculator) = calc match {
  case Calculator("HP", "20B") => "financial"
  case Calculator("HP", "48G") => "scientific"
  case Calculator("HP", "30B") => "business"
  case Calculator(_, _) => "Calculator of unknown type"
  //case _ => "Calculator of unknown type"
  //case c@Calculator(_, _) => "Calculator: %s of unknown type".format(c)
  //case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
}
