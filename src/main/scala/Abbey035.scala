object Abbey035 extends App {
  def yearsToWait(start: Int, end: Int, interest: Int) = {
    val percent = interest/100f
    var current = BigDecimal(start).setScale(2,BigDecimal.RoundingMode.DOWN)
    Stream.continually {
      current += current*percent
      current
    }.indexWhere(_ >= end) + 1
  }
  val n = readInt()
  val lines = Iterator.continually(readLine()).take(n)
  val items = lines.map(_.split(" ").map(_.toInt))
  val waitingTimes = items.map(line => yearsToWait(line(0),line(1),line(2)))
  println(waitingTimes.mkString(" "))
}
