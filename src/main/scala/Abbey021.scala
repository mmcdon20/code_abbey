object Abbey021 extends App {
  val n = readLine().split(" ").map(_.toInt).apply(1)
  val numbers = readLine().split(" ").map(_.toInt)
  val counts = (1 to n).map(i => numbers.count(_ == i))
  println(counts.mkString(" "))
}
