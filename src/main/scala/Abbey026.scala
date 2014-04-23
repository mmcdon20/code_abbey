object Abbey026 extends App {
  def gcd(a: Int, b: Int): Int = if (b == 0) a.abs else gcd(b,a%b)
  def lcm(a: Int, b: Int): Int = (a*b).abs / gcd(a,b)
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toInt))
  val gcdlcms = items.map { item =>
    s"(${gcd(item(0),item(1))} ${lcm(item(0),item(1))})"
  }
  println(gcdlcms.mkString(" "))
}
