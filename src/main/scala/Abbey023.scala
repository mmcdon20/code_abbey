object Abbey023 extends App {
  val array = readLine().split(" ").map(_.toLong).dropRight(1)
  val operations = (0 until array.length - 1) count { i =>
    if (array(i) > array(i+1)) {
      val temp   = array(i)
      array(i)   = array(i+1)
      array(i+1) = temp
      true
    } else false
  }
  val checksum = array.foldLeft(0L)((acc,num) => (acc+num) * 113 % 10000007)
  println(operations + " " + checksum)
}
