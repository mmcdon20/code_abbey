object Abbey013 extends App {
  def wsd(n: Long) =
    n.toString.map(_.asDigit).zipWithIndex.map(d => d._1 * (d._2+1)).sum
  val n = Console.readInt()
  val input = Console.readLine().split(" ").map(_.toLong)
  val scores = input.map(wsd)
  println(scores.mkString(" "))
}
