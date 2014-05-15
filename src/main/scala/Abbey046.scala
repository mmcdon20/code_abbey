object Abbey046 extends App {
  def checkWin(board: Array[Array[Char]]): Boolean = {
    for (i <- 0 until 3) {
      if (board(i)(0) == board(i)(1) && board(i)(1) == board(i)(2)) {
        if (board(i)(0) == 'X' || board(i)(0) == 'O') return true
      }
      if (board(0)(i) == board(1)(i) && board(1)(i) == board(2)(i)) {
        if (board(0)(i) == 'X' || board(0)(i) == 'O') return true
      }
    }
    if (board(0)(0) == board(1)(1) && board(1)(1) == board(2)(2)) {
      if (board(0)(0) == 'X' || board(0)(0) == 'O') return true
    }
    if (board(0)(2) == board(1)(1) && board(1)(1) == board(2)(0)) {
      if (board(0)(2) == 'X' || board(0)(2) == 'O') return true
    }
    false
  }

  def countMoves(item: Array[Int]): Int = {
    val board = Array.ofDim[Char](3,3)
    var player = true
    var count = 0
    for (move <- item) {
      val (r,c) = place(move)
      count += 1
      board(r)(c) = if (player) 'X' else 'O'
      player = !player
      if (checkWin(board)) return count
    }
    0
  }

  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toInt))
  val place = Map(1 -> (0,0), 2 -> (0,1), 3 -> (0,2),
                  4 -> (1,0), 5 -> (1,1), 6 -> (1,2),
                  7 -> (2,0), 8 -> (2,1), 9 -> (2,2))
  val wins = items.map(countMoves)
  println(wins.mkString(" "))
}

