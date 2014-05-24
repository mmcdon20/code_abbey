object Abbey039 extends App {
  def isVolatile (prices: Array[Double]): Boolean = deviation(prices) >= commission(prices) * 4.0
  def commission (prices: Array[Double]): Double  = mean(prices) * 0.01
  def mean       (prices: Array[Double]): Double  = prices.sum / prices.size
  def deviation  (prices: Array[Double]): Double  = {
    val m = mean(prices)
    val s = prices.size
    Math.sqrt(prices.foldLeft(0.0){(acc,cur) => acc + Math.pow(cur-m,2)} / s)
  }

  val n = readInt()
  val lines = Iterator.continually(readLine().split(" ")).take(n)
  val prices = lines.foldLeft(List[(String,Array[Double])]()){ (acc, cur) =>
    (cur.head -> cur.tail.map(_.toDouble)) :: acc
  }
  val volatile = prices.foldLeft(List[String]()){ (acc,cur) =>
    if (isVolatile(cur._2)) cur._1 :: acc else acc
  }
  println(volatile.mkString(" "))
}