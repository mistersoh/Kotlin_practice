/**
 * 조건문에서 조건이 하나 뿐이라면 조건문 생략도 가능하다.
 *  - if
 *  - when
 *  - 
 * 
 * 조건문:
 *  - 부/등호: < <= > >= != ==
 *  - is/!is
 *  
 */
fun main() {
  doWhen("213")
  // var x = 5
  // print(x++)
  // println("Hello World")
  // print("Do dinasours still exist?\n")
  // print(false)
  // print("\nx is $x.")
  // println(" x Got Updated!!")
  // print("Is x equal to 6?: ${x == 6}\n")  
} 

fun doWhen(a: Any){
  print("$a ")
  val result = when(a){ // 등호나 부등호는 사용할 수 없다
    is Int -> println("is int")
    is Long -> println("Long형식 입니다")
    is String -> println("is string")
    else -> println("$a does not belongs to any")
  }
  println(result)
}
