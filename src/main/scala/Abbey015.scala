object Abbey015 extends App {
  val numbers = Console.readLine().split(" ").map(_.toLong)
  println(numbers.max + " " + numbers.min)
}
