object OptionSample extends App {
  def f(): String = if (math.random < 0.5) "OK" else null
  // null を返すやつは Option() で包む。
  // Some(f()) だと f() が null を返した時に None になってくれない(Some(null)になる)ので注意。
  def g(): Option[String] = Option(f())
  println("string length is %d".format(g().getOrElse("").size))
}
