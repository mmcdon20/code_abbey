object Abbey050 extends App {
  val letters = ('a' to 'z').toSet
  def isPalindrome(text: String) =
    text.toLowerCase.filter(letters) == text.toLowerCase.filter(letters).reverse
  val n = Console.readInt()
  val lines = Iterator.continually(Console.readLine()).take(n)
  val palindromes = lines.map{line => if (isPalindrome(line)) "Y" else "N"}
  println(palindromes.mkString(" "))
}
