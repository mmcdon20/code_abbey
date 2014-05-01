object Abbey069 extends App {
  val fibStream: Stream[BigInt] =
    BigInt(0) #:: BigInt(1) #:: (fibStream zip fibStream.tail).map(t => t._1 + t._2)
  val n = readInt()
  val divisors = readLine().split(" ").map(_.toLong)
  val indexes = divisors.map(div => fibStream.indexWhere(fib => fib % div == 0 && fib >= div))
  println(indexes.mkString(" "))
}
