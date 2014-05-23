object Abbey034 extends App {
  def equation(a: Double, b: Double, c: Double, d: Double, x: Double): Int =
    a * x + b * Math.sqrt(x*x*x) - c * Math.exp(-x / 50) - d match {
      case result if Math.abs(result) < 0.00000001 =>  0
      case result if result           < 0.0        => -1
      case result if result           > 0.0        =>  1
    }

  def search(a: Double, b: Double, c: Double, d: Double): Double = {
    var (x,left,right) = (50.toDouble,0.toDouble,100.toDouble)
    while (equation(a,b,c,d,x) != 0) {
      if (equation(a,b,c,d,x) == 1) {
        val temp = x
        x = (x + left) / 2.0
        right = temp
      } else {
        val temp = x
        x = (x + right) / 2.0
        left = temp
      }
    }
    x
  }

  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toDouble))
  val searches = items.map(item => search(item(0),item(1),item(2),item(3)))
  println(searches.mkString(" "))
}
