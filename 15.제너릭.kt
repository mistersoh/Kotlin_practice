/**
 *
 */

fun main() {
    var a = Drink()
    a.drink()

    var b: Drink = Coke()
    b.drink()

    if (b is Coke) { // is 는 변수가 자요형에 호환되는지를 먼저 체크 후 변환.
        // 조건문 안에서만 잠시 다운캐스팅이 된다.
        b.trash()
    }

    var c = b as Coke // 업캐스팅. 변수를 호환되는 자료형으로 변환해주느 캐스팅 연산자
    c.trash()
    b.trash() // as를 쓰면 반환값 뿐만 아니라 변수 자체도 다운캐스팅이 된다
}

open class Drink {
    var name = "Something to drink"

    open fun drink() {
        println("Drinks $name")
    }
}

class Coke : Drink() {
    var type = "Cola"

    override fun drink() {
        println("Drinking $name which is $type")
    }

    fun trash() {
        println("bin the $type")
    }
}
