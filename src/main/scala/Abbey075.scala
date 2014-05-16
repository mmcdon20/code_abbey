object Abbey075 extends App {
  def play(rolls: List[Int]) = rolls.groupBy(k => k).values.map(_.size) match {
    case _ if rolls.sorted == List(2,3,4,5,6)      => "big-straight"
    case _ if rolls.sorted == List(1,2,3,4,5)      => "small-straight"
    case g if g.exists(_ == 3) && g.exists(_ == 2) => "full-house"
    case g if g.count(_ == 2) == 2                 => "two-pairs"
    case g if g.exists(_ == 5)                     => "yacht"
    case g if g.exists(_ == 4)                     => "four"
    case g if g.exists(_ == 3)                     => "three"
    case g if g.exists(_ == 2)                     => "pair"
    case _                                         => "none"
  }
  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toInt))
  val yachts = items.map(_.toList).map(play)
  println(yachts.mkString(" "))
}
