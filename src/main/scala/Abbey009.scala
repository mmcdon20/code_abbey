object Abbey009 extends App {
  def isTriangle(a:Int, b:Int, c:Int) =
    if ((a+b > c) && (a+c > b) && (b+c > a)) 1 else 0
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val sides = lines.map(_.split(" ").map(_.toInt))
  val triangles = sides.map(s => isTriangle(s(0),s(1),s(2)))
  println(triangles.mkString(" "))
}
