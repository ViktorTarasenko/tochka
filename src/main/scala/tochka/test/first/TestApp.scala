package tochka.test.first

object TestApp extends App {
  val t = "asdasdaaaweqbbbbasdasd".toSeq.groupBy(char => char).values.toSeq.sortWith(_.length >= _.length).mkString
  Console.println(t)
}
