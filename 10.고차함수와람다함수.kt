/**
 * 고차함수 - 함수를 클래스에서 만든 인스턴스처럼 취급하는 방법.
 *           패러미터로 넘길 수도, 결과값으로 반환도 가능.
 *           코틀린에서는 모든 함수를 고차함수처럼 사용 가능하다.
 * 
 * 람다함수 - 함수를 람다식으로 표현.
 */

fun main() {
    b(::a) // :: -> 고차함수 형태로 변경해주는 연산자

    val c: (String)->Unit = { str -> println("$str is lambda function")} //str을 자동으로 string임을 추론
    b(c) // 람다함수 자체가 고차함수이기에 연산자가 필요없다.
}

fun a (str:String){
    println("$str is received")
}

fun b (function: (String)->Unit){ //Unit: 반환경에는 값이 없다는 뜻
    function("B has called")
}