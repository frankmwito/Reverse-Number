import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  val scanner = Scanner(System.`in`)
  val number = scanner.nextInt()
  var tempNumber = number
  var reversedNumber = 0

  while (tempNumber != 0 )
  {
    val digit = tempNumber % 10
    reversedNumber = reversedNumber * 10 + digit
    tempNumber /= 10
  }

  println("reversed number = $reversedNumber")
}
