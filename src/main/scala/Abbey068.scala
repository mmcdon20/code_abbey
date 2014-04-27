object Abbey068 extends App {
  def meetingPoint(s: Double, a: Double, b: Double) = (s/(a+b))*a
  val n = readInt()
  val lines = Iterator.continually(readLine()).take(readInt())
  val items = lines.map(_.split(" ").map(_.toDouble))
  val meetings = items.map(item => meetingPoint(item(0),item(1),item(2)))
  println(meetings.mkString(" "))
}