object Abbey043 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val rolls = lines.map(_.toFloat).map(_ * 6 + 1).map(_.toInt)
  println(rolls.mkString(" "))
}
