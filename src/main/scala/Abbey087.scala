object Abbey087 extends App {
  val n = readInt()
  val numbers = readLine().split(" ").map(_.toInt).toList
  val tree = Node(numbers.head)
  numbers.tail.foreach(tree.insert)
  println(tree)
}

case class Node(item: Int, var left: Node = null, var right: Node = null) {
  private def sub(n: Node) = if (n == null) "-" else n
  override def toString = s"(${sub(left)},$item,${sub(right)})"
  def insert(n: Int): Unit = (left,right) match {
    case (null,_) if n < item => left = Node(n)
    case (_,null) if n > item => right = Node(n)
    case (_,_)    if n < item => left.insert(n)
    case (_,_)    if n > item => right.insert(n)
  }
}
