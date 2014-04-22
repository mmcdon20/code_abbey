object Abbey012 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val numbers = lines.map(_.split(" ").map(_.toLong))
  val dates = numbers.map { n =>
    val (day1, hour1, min1, sec1, day2, hour2, min2, sec2) =
      (n(0),n(1),n(2),n(3),n(4),n(5),n(6),n(7))
    val time1 = sec1 + min1*60 + hour1*3600 + day1*86400
    val time2 = sec2 + min2*60 + hour2*3600 + day2*86400
    val diff = time2 - time1
    val (day, hour, min, sec) =
      (diff/86400%365, diff/3600%24, diff/60%60, diff%60)
    s"($day $hour $min $sec)"
  }
  println(dates.mkString(" "))
}
