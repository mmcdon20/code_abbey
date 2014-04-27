object Abbey040 extends App {
  val items = readLine().split(" ").map(_.toInt)
  val (rows,cols) = (items(0),items(1))
  val lines = Iterator.continually(readLine()).take(rows)
  val grid = lines.map(_.split(" ")).toArray
  val table = Array.ofDim[Int](rows,cols)
  for (row <- 0 until rows; col <- 0 until cols) (row,col) match {
    case (0,0)                      => table(0)(0) = 1
    case (r,c) if grid(r)(c) == "X" => table(r)(c) = 0
    case (r,0)                      => table(r)(0) = table(r-1)(0)
    case (0,c)                      => table(0)(c) = table(0)(c-1)
    case (r,c)                      => table(r)(c) = table(r-1)(c) + table(r)(c-1)
  }
  println(table.last.last)
}
