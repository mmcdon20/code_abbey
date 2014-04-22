object Abbey008 extends App {
  def sequence(a:Int, b:Int, n:Int) = (0 until n).map(n => a + n*b).sum
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val data = lines.map(_.split(" ").map(_.toInt))
  val sequences = data.map(items => sequence(items(0),items(1),items(2)))
  println(sequences.mkString(" "))
}
