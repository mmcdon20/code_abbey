object Abbey020 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val vowels = Set('a','e','i','o','u','y')
  val counts = lines.map(_.count(vowels))
  println(counts.mkString(" "))
}
