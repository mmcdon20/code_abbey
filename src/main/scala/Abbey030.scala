object Abbey030 extends App {
  def reverse(text: String): String =
    if (text.isEmpty) "" else reverse(text.tail) :+ text.head
  println(reverse(readLine()))
}
