object Abbey017 extends App {
  val n = Console.readInt()
  val numbers = Console.readLine().split(" ").map(_.toLong)
  val result = numbers.foldLeft(0L)((acc,num) => (acc+num) * 113 % 10000007)
  println(result)
}
