import util.{Success, Failure, Try}

object TrySample extends App {
  val sumTry: Try[Int] = for {
    int1 <- Try(Integer.parseInt("1"))
    int2 <- Try(Integer.parseInt("2"))
  } yield {
    int1 + int2
  }

  sumTry match {
    case Failure(e) =>
      e.printStackTrace()
    case Success(v) =>
      println(v)
  }
}
