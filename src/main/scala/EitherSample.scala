case class FailResult(reason: String)

object EitherSample extends App {
  def f(): Either[FailResult, String] =
    if (math.random < 0.5)
      Right("abc")
    else
      Left(FailResult("failed"))
  f().fold(
    error => println("error: " + error.reason),
    success => println("success: " + success)
  )
}
