object Abbey041 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toInt))
  val medians = items.map(_.sortWith(_<_)(1))
  println(medians.mkString(" "))
}
