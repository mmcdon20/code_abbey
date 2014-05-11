object Abbey062 extends App {
  val primes = SieveOfAtkin(3000000)
  val n = readInt()
  val lines = Iterator.continually(readLine().split(" ")).take(n)
  val items = lines.map(_.map(_.toInt))
  val counts = items.map(item => primes.count(n => n >= item(0) && n <= item(1)))
  println(counts.mkString(" "))
}

object SieveOfAtkin { def apply(limit: Int) = new SieveOfAtkin(limit).primes }

private class SieveOfAtkin(limit: Int) {
  lazy val primes = isPrime.indices.filter(isPrime)
  private val isPrime = Array.ofDim[Boolean](limit+1)
  private val sqrt = math.sqrt(limit).round.intValue
  isPrime(2) = true
  isPrime(3) = true

  for (x <- 1 to sqrt; y <- 1 to sqrt) {
    val a = 4*x*x + y*y
    val b = 3*x*x + y*y
    val c = 3*x*x - y*y
    if (a <= limit && (a % 12 == 1 || a % 12 == 5))
      isPrime(a) = !isPrime(a)
    if (b <= limit && b % 12 == 7)
      isPrime(b) = !isPrime(b)
    if (x > y && c <= limit && c % 12 == 11)
      isPrime(c) = !isPrime(c)
  }

  for (n <- 5 to sqrt; if isPrime(n); k <- Stream.from(1).map(_*n*n).takeWhile(_ <= limit)) {
    isPrime(k) = false
  }
}
