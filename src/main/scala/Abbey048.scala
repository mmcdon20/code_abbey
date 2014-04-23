object Abbey048 extends App {
  def collatz(n: Long, c: Int = 0): Int = n match {
    case x if x     == 1 => c
    case x if x % 2 == 0 => collatz(x/2,c+1)
    case x if x % 2 == 1 => collatz(3*x+1,c+1)
  }
  val n = Console.readInt()
  val items = readLine().split(" ").map(_.toLong)
  val collatzes = items.map(collatz(_))
  println(collatzes.mkString(" "))
}
