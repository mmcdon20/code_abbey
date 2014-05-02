object Abbey094 extends App {
  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toLong))
  val squareSums = items.map(_.map(n => n*n).sum)
  println(squareSums.mkString(" "))
}
