object Abbey038 extends App {
  def quadratic(a:Float, b:Float, c:Float) = {
    val discriminant = b*b - 4*a*c
    val root = Math.sqrt(Math.abs(discriminant)).toInt
    val x1 = ((-b + root) / (2*a)).toInt
    val x2 = ((-b - root) / (2*a)).toInt
    val i1 = (-b / (2*a)).toInt
    val i2 = (root / (2*a)).toInt
    if (discriminant >= 0) s"$x1 $x2" else s"$i1+${i2}i $i1-${i2}i"
  }

  val n = readInt()
  val lines = Iterator.continually(readLine().split(" ")).take(n)
  val items = lines.map(_.map(_.toFloat))
  val quads = items.map(item => quadratic(item(0),item(1),item(2)))
  println(quads.mkString("; "))
}
