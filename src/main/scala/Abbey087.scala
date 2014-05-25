object Abbey087 extends App {
  val n = readInt()
  val numbers = readLine().split(" ").map(_.toInt).toList
  val tree = Fork(numbers.head)
  numbers.tail.foreach(tree.insert)
  println(tree)
}

abstract class Tree {
  def insert(n: Int): Unit
}

case class Fork(item: Int, var left: Tree = Leaf(), var right: Tree = Leaf()) extends Tree {
  override def toString = s"(${left.toString},$item,${right.toString})"
  def insert(n: Int) = (left,right) match {
    case (Leaf(),_) if n < item => left = Fork(n)
    case (_,Leaf()) if n > item => right = Fork(n)
    case _          if n < item => left.insert(n)
    case _          if n > item => right.insert(n)
  }
}

case class Leaf() extends Tree {
  override def toString = "-"
  def insert(n: Int) = ()
}