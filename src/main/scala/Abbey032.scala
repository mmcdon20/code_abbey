object Abbey032 extends App {
  val items = readLine().split(" ").map(_.toInt)
  val (n,k) = (items(0),items(1))
  var remaining = (1 to n).toList
  var dudes = 0 #:: Stream.continually(remaining).flatten
  while (remaining.size > 1) {
    dudes = dudes.drop(k)
    remaining = remaining.filterNot(_ == dudes.head)
  }
  println(remaining.head)
}