/**
 * overloading - 같은 스코프 내에서 같은 함수가 여러 argument 받는 기능
 *
 * infic function - function을 연산자처럼 쓸 수 있다
 */

fun main() {
    // overloading
    println("overloading")
    read(4)
    read("My ym")

    // default argument
    println("default argument")
    deliveryItme("note")
    deliveryItme("note", 5)
    deliveryItme("note", 5, "Company")
    // deliveryItme("note", "company") // not work

    // named argument
    println("named argument")
    deliveryItme("note", destination = "Company")
    deliveryItme("note", count = 6)
    deliveryItme("note", who = "my dog")

    // variable number of arguments(vararg)
    println("vararg")
    sum("Start Counting", 1, 3, 4, 5, 6) // 갯수가 지정되지 않음, 항상 맨 마지막에 위치

    // infix function
    println("infix function")
    println(4 multiply 8)
}

fun read(x: Int) {
    println("Read $x number of books")
}

fun read(x: String) {
    println("Read book called $x")
}

fun deliveryItme(name: String, count: Int = 1, destination: String = "Home", who: String = "Me") {
    println("Delivered $count number of $name to $destination to $who")
}

fun sum(text: String, vararg numbers: Int) {
    var sum = 0

    println("$text")
    for (n in numbers) {
        sum += n
    }

    println(sum)
}

infix fun Int.multiply(x: Int): Int = this * x // class 안에서 선언될 시,
                                               // 적용할 클래스가 자기자신 
                                               // 이므로 class 이름은 쓰지
                                               // 않는다
