/**
 * 오브젝트 - 생성자 없이 객체를 직접 만들어 냄.
 *           = 싱글톤 패턴
 *
 * 컴패니언 오브젝트 - 클래스 안에 오브젝트를 만드는 것.
 *                    인스턴스 간에 공용으로 쓸 속성과 함수를 만드는 것.
 *                    기존 언어의 static 멤버와 비슷.
 */

fun main() {
    println(Counter.count)

    Counter.increase()
    Counter.increase()
    Counter.increase()
    Counter.increase()
    Counter.decrease()

    println(Counter.count)

    var r = RedBlue("Red")
    var b = RedBlue("Blue")

    r.vote()
    r.vote()
    r.vote()
    r.vote()

    b.vote()
    b.vote()
    b.vote()
    b.vote()
    b.vote()

    println("${r.name} has ${r.count}, ${b.name} has ${b.count}, total is ${RedBlue.total}")
}

// object
object Counter {
    var count = 0

    fun increase() {
        count++
    }

    fun decrease() {
        count--
    }
}

// companion object
class RedBlue(val name: String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
}
