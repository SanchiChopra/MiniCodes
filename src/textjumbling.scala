
object textjumbling extends App{
  def scrambleWord(word: String) : String = {
    if(word.length <= 3)
      word
    else {
      val middle = word.substring(1, word.length - 1)
      val middleScrambled: String = (0 until middle.length).foldLeft(middle) {
        case (acc, cur) =>
          val pos = (math.random * middle.length).toInt
          acc.updated(cur, acc(pos)).updated(pos, acc(cur))
      }

      word.patch(1, middleScrambled, middleScrambled.length)
    }
  }
  scrambleWord("Worksheet")
}