object Abbey011 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val numbers = lines.map(_.split(" ").map(_.toInt)).map(nums => nums(0) * nums(1) + nums(2))
  val digitSums = numbers.map(_.toString.map(_.asDigit).sum)
  println(digitSums.mkString(" "))
}
