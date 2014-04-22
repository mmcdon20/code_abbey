object Abbey003 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val sums = lines.map(_.split(" ").map(_.toLong).sum)
  println(sums.mkString(" "))
}