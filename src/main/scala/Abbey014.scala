object Abbey014 extends App {
  val n = Console.readLong()
  val lines = Iterator.continually(Console.readLine()).takeWhile(_ != "")
  val result = lines.foldLeft(n) { (acc, op) => op.split(" ").toList match {
    case "+" :: x :: Nil => acc + x.toLong
    case "-" :: x :: Nil => acc - x.toLong
    case "*" :: x :: Nil => acc * x.toLong
    case "/" :: x :: Nil => acc / x.toLong
    case "%" :: x :: Nil => acc % x.toLong
    case _ => acc
  }}
  println(result)
}
