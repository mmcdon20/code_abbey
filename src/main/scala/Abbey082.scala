object Abbey082 extends App {
  def distance(text1: String, text2: String): Int = {
    if (text1 == text2) return 0
    if (text1.length == 0) return text2.length
    if (text2.length == 0) return text1.length
    val v1 = Array.ofDim[Int](text2.length+1)
    val v2 = Array.ofDim[Int](text2.length+1)

    for (i <- 0 until v1.length) {
      v1(i) = i
    }

    for (i <- 0 until text1.length) {
      v2(0) = i + 1

      for (j <- 0 until text2.length) {
        val cost = if (text1(i) == text2(j)) 0 else 1
        v2(j + 1) = ((v2(j)+1) :: (v1(j+1)+1) :: (v1(j)+cost) :: Nil).min
      }

      for (j <- 0 until v1.length) {
        v1(j) = v2(j)
      }
    }
    v2(text2.length)
  }

  val n = readInt()
  val lines = Iterator.continually(readLine().split(" ")).take(n)
  val distances = lines.map(line => distance(line(0),line(1)))
  println(distances.mkString(" "))
}
