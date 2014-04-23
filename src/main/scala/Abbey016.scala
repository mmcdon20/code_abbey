object Abbey016 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toFloat).dropRight(1))
  val averages = items.map(a => a.sum / a.length).map(Math.round)
  println(averages.mkString(" "))
}
