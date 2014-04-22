object Abbey006 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val fractions = lines.map(_.split(" ").map(_.toFloat).foldRight(1f)(_/_))
  val rounds = fractions.map(Math.round)
  println(rounds.mkString(" "))
}
