object Abbey053 extends App {
  def slope(x1: Float, y1: Float, x2: Float, y2: Float) =
    if (x1 - x2 == 0) 0f else (y2-y1)/(x2-x1)

  def canTake(kingRow: Int, kingCol: Int, queenRow: Int, queenCol: Int) = {
    val m = slope(kingRow,kingCol,queenRow,queenCol)
    if (kingRow == queenRow || queenCol == kingCol) 'Y'
    else if (m == 1 || m == -1) 'Y'
    else 'N'
  }

  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val rows = Map('a' -> 1, 'b' -> 2, 'c' -> 3, 'd' -> 4, 'e' -> 5, 'f' -> 6, 'g' -> 7, 'h' -> 8)
  val cols = Map('1' -> 1, '2' -> 2, '3' -> 3, '4' -> 4, '5' -> 5, '6' -> 6, '7' -> 7, '8' -> 8)
  val items = lines.map(_.split(" ").map(item => rows(item(0)) :: cols(item(1)) :: Nil).flatten)
  val queenWins = items.map(item => canTake(item(0),item(1),item(2),item(3)))
  println(queenWins.mkString(" "))
}
