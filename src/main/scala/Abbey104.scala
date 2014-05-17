object Abbey104 extends App {
  def area(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double) =
    Math.abs(0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)))
  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toDouble))
  val areas = items.map(item => area(item(0),item(1),item(2),item(3),item(4),item(5)))
  println(areas.mkString(" "))
}
