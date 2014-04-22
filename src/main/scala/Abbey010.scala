object Abbey010 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val pairs = lines.map(_.split(" ").map(_.toInt))
  def slope(x1:Int, y1:Int, x2:Int, y2:Int) = (y2-y1)/(x2-x1)
  def intercept(x:Int, y:Int, m:Int) = y - m*x
  val abs = pairs.map{ pair =>
    val m = slope(pair(0),pair(1),pair(2),pair(3))
    val b = intercept(pair(0),pair(1),m)
    s"($m $b)"
  }
  println(abs.mkString(" "))
}
