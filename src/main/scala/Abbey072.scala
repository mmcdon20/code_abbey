object Abbey072 extends App {
  def next(n: Int) =
    { x = (445 * x + 700001) % 2097152; x }

  def makeLetter(cur: Int) =
    if (cur % 2 != 0) vowels((next(cur)%5).toInt) else consonants((next(cur)%19).toInt)

  def makeWord(n: Int) =
    (0 until n).foldLeft(""){ (acc,cur) => acc + makeLetter(cur) }

  val consonants = "bcdfghjklmnprstvwxz"
  val vowels = "aeiou"
  var x = readLine().split(" ")(1).toLong
  val items = readLine().split(" ").map(_.toInt)
  val words = items.map(makeWord)
  println(words.mkString(" "))
}
