object Abbey033 extends App {
  def toBinary(i: Int) = String.format("%8s", i.toBinaryString).replace(' ', '0')
  def decode(binary: String) = Integer.parseInt(binary, 2).toChar
  def flip(binary: String) = if (binary.head == '0') '1' + binary.tail else '0' + binary.tail

  val items = readLine().split(" ").map(_.toInt)
  val binary = items.map(toBinary)
  val text = binary.foldLeft("") { (acc, bin) =>
    val fixup = if (bin(0) == '0') bin else flip(bin)
    val parity = bin.count(_ == '1')
    val character = if (parity % 2 == 0) decode(fixup) else ""
    acc + character
  }

  println(text)
}
