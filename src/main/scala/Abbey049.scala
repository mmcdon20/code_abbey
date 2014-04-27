object Abbey049 extends App {
  def round(moves: String) = moves.toList match {
    case 'R' :: 'R' :: Nil => 0
    case 'R' :: 'P' :: Nil => -1
    case 'R' :: 'S' :: Nil => 1
    case 'P' :: 'R' :: Nil => 1
    case 'P' :: 'P' :: Nil => 0
    case 'P' :: 'S' :: Nil => -1
    case 'S' :: 'R' :: Nil => -1
    case 'S' :: 'P' :: Nil => 1
    case 'S' :: 'S' :: Nil => 0
  }
  def game(rounds: Array[String]) =
    if (rounds.foldLeft(0)(_ + round(_)) > 0) 1 else 2
  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" "))
  val games = items.map(game)
  println(games.mkString(" "))
}
