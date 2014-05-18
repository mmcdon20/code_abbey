object Abbey070 extends App {
  def next(n: Int) = { x = (445 * x + 700001) % 2097152; x }

  def makeLetter(cur: Int) =
    if (cur % 2 != 0) vowels((next(cur)%5).toInt) else consonants((next(cur)%19).toInt)

  def makeWord(n: Int) =
    (0 until n).foldLeft(""){ (acc,cur) => acc + makeLetter(cur) }

  val consonants = "bcdfghjklmnprstvwxz"
  val vowels = "aeiou"
  var x = readLong()

  val counts = scala.collection.mutable.Map[String,Int]().withDefaultValue(0)
  for (_ <- 0 until 900000) { counts(makeWord(6)) += 1 }
  val frequent = counts.maxBy(_._2)._1

  println(frequent)
}
