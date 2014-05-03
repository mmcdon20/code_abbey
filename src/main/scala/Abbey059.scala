object Abbey059 extends App {
  val start = readLine().split(" ")(0)
  val items = readLine().split(" ")
  val bullsAndCows = items.map { item =>
    val bulls = item.zip(start).count(zip => zip._1 == zip._2)
    val cows = (start.toSet & item.toSet).size - bulls
    s"$bulls-$cows"
  }
  println(bullsAndCows.mkString(" "))
}
