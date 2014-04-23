object Abbey018 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toInt))
  def heron(n: Int, limit: Int) = {
    var (prev, next) = (1.0, 0.5 * (1 + n))
    (1 to limit).foreach { i =>
      prev = next
      next = 0.5 * (next + n/next)
    }
    prev
  }
  val approximations = items.map(i => heron(i(0),i(1)))
  println(approximations.mkString(" "))
}
