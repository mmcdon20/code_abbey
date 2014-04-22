object Abbey007 extends App {
  val fahrenheit = Console.readLine().split(" ").map(_.toFloat).drop(1)
  val celsius = fahrenheit.map(t => (t - 32f)*(5f/9f)).map(Math.round)
  println(celsius.mkString(" "))
}
