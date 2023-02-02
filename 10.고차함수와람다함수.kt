/**
 * 고차함수 - 함수를 클래스에서 만든 인스턴스처럼 취급하는 방법.
 *           패러미터로 넘길 수도, 결과값으로 반환도 가능.
 *           코틀린에서는 모든 함수를 고차함수처럼 사용 가능하다.
 *
 * 람다함수 - 함수를 람다식으로 표현.
 *         - 특수 케이스들:
 *           - 람다함수도 여러 구문의 사용이 가능, 마지막 구문에 결과값이 반환 됨.
 *           - 람다함수에 패러미터가 없다면 실행할 구문들만 나욜하면 된다.
 *           - 패러미터가 하나뿐이라면 it 사용.
 */

fun main() {
    b(::a) // :: -> 고차함수 형태로 변경해주는 연산자

    // 일반적 사용
    println("------Usual Case------")
    val c: (String) -> Unit = { str -> println("$str is lambda function") } // str을 자동으로 string임을 추론
    b(c) // 람다함수 자체가 고차함수이기에 연산자가 필요없다.

    // 람다식을 매개변수와 인자로 사용
    println("------Param and arg Case------")
    val d: Int
    d = e({ num1, num2 -> num1 + num2 }, 3, 4)
    println(d)

    // 여러 구문 사용 가능
    println("------Multilines & param Case------")
    val calculate: (Int, Int) -> Int = { a, b ->
        println(a)
        println(b)
        a * b
    }
    f(calculate)

    // 패러미터가 없음
    println("------No param Case------")
    val noPam: () -> Unit = { println("not parameter to pass") }
    noPam()

    // 패러미터가 하나뿐
    println("------One param only Case------")
    oneParam { "Call 1 Param with $it" }

    // nested lambda식
    println("------Nested lambda Case------")
    val nestedLambda: () -> () -> Unit = { { println("nested") } }
    nestedLambda()()

    // 값에 의한 호출(Call by value)
    println("------Call by value Case------")
    val cbvlambda: () -> Boolean = {
        println("Call by value Lambda fcuntion")
        true
    }
    val cbvResult = callByValue(cbvlambda())
    println(cbvResult)

    // 이름에 의한 호출(Call by name)
    println("------Call by name Case------")
    val cbnlambda: () -> Boolean = {
        println("Call by name Lambda fcuntion")
        true
    }
    val cbnResult = callByName(cbnlambda)
    println(cbnResult)
}

fun a(str: String) {
    println("$str is received")
}

fun b(function: (String) -> Unit) { // Unit: 반환경에는 값이 없다는 뜻
    function("B has called")
}

fun e(function: (Int, Int) -> Int, num1: Int, num2: Int): Int {
    return function(num1, num2)
}

fun f(function: (Int, Int) -> Int) {
    println(function(5, 6))
}

fun oneParam(function: (String) -> String) {
    println(function("Just 1 param"))
}

fun callByValue(bool: Boolean): Boolean {
    println("Called by value function")
    return bool
}

fun callByName(bool: () -> Boolean): Boolean {
    println("Called by name function")
    return bool()
}
