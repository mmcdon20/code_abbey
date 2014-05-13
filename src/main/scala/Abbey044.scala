object Abbey044 extends App {
  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toLong))
  val rolls = items.map(item => (item(0)%6) + (item(1)%6) + 2)
  println(rolls.mkString(" "))
}
