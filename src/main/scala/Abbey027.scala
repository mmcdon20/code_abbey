object Abbey027 extends App {
  def bubble (array: Array[Int]): (Int,Int) = {
    var (passes,swaps,continue) = (0,0,true)
    while (continue) {
      continue = false
      for (i <- 0 until array.length - 1; if array(i) > array(i+1)) {
        val temp   = array(i)
        array(i)   = array(i+1)
        array(i+1) = temp
        swaps      = swaps + 1
        continue   = true
      }
      passes += 1
    }
    (passes,swaps)
  }
  val n = readInt()
  val numbers = readLine().split(" ").map(_.toInt)
  val result = bubble(numbers)
  println(s"${result._1} ${result._2}")
}
