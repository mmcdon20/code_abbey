object Abbey067 extends App {
  val fibStream: Stream[BigInt] =
    BigInt(0) #:: BigInt(1) #:: (fibStream zip fibStream.tail).map(t => t._1 + t._2)
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val fibs = lines.map(BigInt(_))
  val indexes = fibs.map(fibStream.indexOf(_))
  println(indexes.mkString(" "))
}
