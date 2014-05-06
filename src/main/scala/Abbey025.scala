object Abbey025 extends App {
  def generator(a: Long, c: Long, m: Long, x: Long, n: Int) =
    (0 until n).foldLeft(x)((xCur,_) => (a * xCur + c) % m)
  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toInt))
  val generated = items.map(item => generator(item(0),item(1),item(2),item(3),item(4)))
  println(generated.mkString(" "))
}
