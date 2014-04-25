object Abbey029 extends App {
  val n = readInt()
  val unsorted = readLine().split(" ").map(_.toInt)
  val sorted = unsorted.sorted
  val indexes = sorted.map(unsorted.indexOf(_) + 1)
  println(indexes.mkString(" "))
}
