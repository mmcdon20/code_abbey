object Abbey005 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val mins = lines.map(_.split(" ").map(_.toLong).min)
  println(mins.mkString(" "))
}
