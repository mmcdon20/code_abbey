object Abbey045 extends App {
  val ranks = Array("A","2","3","4","5","6","7","8","9","T","J","Q","K")
  val suits = Array("C","D","H","S")
  val deck  = for (s <- suits; r <- ranks) yield s+r
  val items = readLine().split(" ").map(_.toInt)

  for (i <- 0 to 51) {
    val rand = items(i) % 52
    val temp = deck(i)
    deck(i) = deck(rand)
    deck(rand) = temp
  }

  println(deck.mkString(" "))
}
