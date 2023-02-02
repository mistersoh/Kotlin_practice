/**
 * 오버라이딩 - 서브클래스에서 같은 이름과 형태로
 *             된 함수의 내용을 다시 구현 가능
 *           - 이미 구현이 끝난 함수의 기능을
 *             서브클래스에서 변경할 때
 *
 * 추상화 - 선언부만 있고 기능이 구현되지 않은
 *          추상함수 및 추상클래스로 구성됨
 *       - 형식만 선언하고 실제 구현은
 *         서브클래스에 일임할 때
 *
 * 인터페이스 - 추상화의 또 다른 방법
 *             추상함수는 생성자를 가질 수 있는 반면,
 *             인터페이스는 생성자를 가질 수 없다.
 *              구현부가 있다 -> open 함수
 *              구현부가 없다 -> abtract 함수
 *           - 서로 다른 기능들 여러 개를 물려줄 때
 */
fun main() {
    var h = Baby()

    h.walk()

    var a = Predetor()
    a.walk()
    a.visit()

    var p = Prayer()
    p.eat()
    p.run()
}

// 오버라이딩
open class Human {
    open fun walk() {
        println("Walking")
    }
}

class Baby : Human() {
    override fun walk() {
        println("crawling")
    }
}

// 추상화
abstract class Alien {
    abstract fun walk()
    fun visit() {
        println("Searching")
    }
}

class Predetor : Alien() {
    override fun walk() {
        println("Flying")
    }
}

// interface
interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("Eat food")
    }
}

class Prayer : Runner, Eater {
    override fun run() {
        println("Run calmly")
    }

    override fun eat() {
        println("Do not eat")
    }
}
