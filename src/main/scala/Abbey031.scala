object Abbey031 extends App {
  def rotate(text: String, n: Int): String =
    if (n > 0) text.drop(n) + text.take(n)
    else text.takeRight(-n) + text.dropRight(-n)
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val items = lines.map { line =>
    val parts = line.split(" ")
    rotate(parts(1),parts(0).toInt)
  }
  println(items.mkString(" "))
}
