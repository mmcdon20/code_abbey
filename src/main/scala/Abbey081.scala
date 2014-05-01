object Abbey081 extends App {
  val n = readInt()
  val items = readLine().split(" ").map(_.toInt)
  val bitCounts = items.map(_.toBinaryString.count(_ == '1'))
  println(bitCounts.mkString(" "))
}
