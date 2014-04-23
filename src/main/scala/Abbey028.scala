object Abbey028 extends App {
  def bmi(weight: Float, height: Float) = weight/(height*height) match {
    case x if x < 18.5f => "under"
    case x if x < 25.0f => "normal"
    case x if x < 30.0f => "over"
    case x              => "obese"
  }
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toFloat))
  val bmis = items.map(i => bmi(i(0),i(1)))
  println(bmis.mkString(" "))
}
