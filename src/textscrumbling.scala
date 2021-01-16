import scala.io.StdIn.readLine

object textscrumbling extends App{
  val lowerMap = Map(
    't' -> '7',
    'i' -> '1',
    's' -> '5',
    'e' -> '3',
    'a' -> '4',
    'o' -> '0'
  )

  val upperMap = lowerMap.map{
    case (k,v) => k.toUpper -> v
  }

  //merging 2 maps using ++
  val allMap = (lowerMap ++ upperMap).withDefault(k => k)
  var inputmsg = readLine

  println(inputmsg.map(allMap))
}
