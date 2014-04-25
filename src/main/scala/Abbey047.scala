object Abbey047 extends App {
  val items = readLine().split(" ").map(_.toInt)
  val (n,k) = (items(0),items(1))
  val alpha = ('A' to 'Z').toList
  val shift = alpha.drop(k) ::: alpha.take(k)
  val lines = Iterator.continually(readLine()).take(n)
  val decode = lines.map { line => line.map { char =>
    if (alpha.contains(char)) alpha(shift.indexOf(char)) else char
  }}
  println(decode.mkString(" "))
}
