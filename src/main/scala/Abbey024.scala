object Abbey024 extends App {
  val n = readInt()
  val numbers = readLine().split(" ").map(_.toLong)
  def random(n: Long) = {
    var square = (n*n).toString
    while (square.length < 8) square = "0" + square
    square.drop(2).take(4).toLong
  }
  def cycle(n: Long) = {
    var current = n
    var items = Set[Long]()
    while (!items(current)) {
      items += current
      current = random(current)
    }
    items.size
  }
  val cycles = numbers.map(cycle)
  println(cycles.mkString(" "))
}
