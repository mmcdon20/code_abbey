object Abbey055 extends App {
  val words = readLine().split(" ")
  val matches = words.filter(word => words.count(_ == word) > 1).distinct.sorted
  println(matches.mkString(" "))
}
