object Abbey057 extends App {
  val n = readInt()
  val items = readLine().split(" ").map(_.toDouble)
  val sets = items.sliding(3)
  val results = (items.head :: sets.map(_.sum/3).toList) :+ items.last
  println(results.mkString(" "))
}
