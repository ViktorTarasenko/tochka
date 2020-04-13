package tochka.test.third
import scala.io.StdIn.readLine

object EmailTest extends App {
  final private val emailTemplate =
    """^((?!\.)(?!.*?\.\.)[a-zA-Z0-9.!#$%&’'"*+/=?^_`{|}~-]*[a-zA-Z0-9!#$%&’'"*+/=?^_`{|}~-]+)@((?!-)[a-zA-Z0-9-.\[]+\.[a-zA-Z0-9-.\]]+)$"""
  Console.println("enter email:")
  val input = readLine()
  val msg = if (isValidEmail(input)) "Valid email" else "Not valid email"
  Console.println(msg)

  def isValidEmail(email: String): Boolean = email.matches(emailTemplate)
}
