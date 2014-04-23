object Abbey019 extends App {
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val items = lines.map { line =>
    val stack = new java.util.Stack[Char]
    var result = 1
    line.foreach {
      case '(' => stack.push('(')
      case '[' => stack.push('[')
      case '{' => stack.push('{')
      case '<' => stack.push('<')
      case ')' if stack.empty || stack.pop != '(' => result = 0
      case ']' if stack.empty || stack.pop != '[' => result = 0
      case '}' if stack.empty || stack.pop != '{' => result = 0
      case '>' if stack.empty || stack.pop != '<' => result = 0
      case _ =>
    }
    if (stack.empty()) result else 0
  }
  println(items.mkString(" "))
}
