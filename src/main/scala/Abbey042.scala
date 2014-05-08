object Abbey042 extends App {
  val cards = Map("2" ->  2, "3" ->  3, "4" ->  4, "5" ->  5,
                  "6" ->  6, "7" ->  7, "8" ->  8, "9" ->  9,
                  "T" -> 10, "J" -> 10, "Q" -> 10, "K" -> 10, "A" -> 11)
  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" ").map(cards).sorted)
  val scores = items.map { item =>
    val (partial, aces) = item.partition(_ < 11)
    var total = partial.sum + aces.length
    for (i <- 1 to aces.length; if total + 10 <= 21) total += 10
    total
  }
  val results = scores.map { s => if (s > 21) "Bust" else s }
  println(results.mkString(" "))
}
