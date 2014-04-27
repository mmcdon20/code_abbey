object Abbey058 extends App {
  val suits = Array("Clubs","Spades","Diamonds","Hearts")
  val ranks = Array("2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace")
  def card(n: Int) = s"${ranks(n%13)}-of-${suits(n/13)}"
  val n = readInt()
  val cards = readLine().split(" ").map(_.toInt).map(card)
  println(cards.mkString(" "))
}
