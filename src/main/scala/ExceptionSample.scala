class MyException extends Exception

object ExceptionSample extends App {

  def f() {
    throw new MyException()
  }

  try {
    f()
    println("This line is not reached")
  } catch {
    case e: MyException => println(e)
  } finally {
    println("in finally")
  }
}
