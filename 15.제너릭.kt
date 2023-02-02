/**
 * 제너릭 - 클래스나 함수에서 사용하는 자료형을 외부에서 지정하는 기능.
 *         - 캐스팅을 해도 되나 프로그램의 속도를 저하시킬 수 있다.
 *         - 함수나 클래스를 선언할 때 고정적인 자료형 대신 실제
 *           자료형으로 대체되는 타입 패러미터를 받아 사용한다.
 *           (타입을 자동 추론)
 *         - 일반적으로 Type을 뜻하는 T를 사용, 여러개일 경우 T 다음
 *           알파벳 사용
 *         - 제네릭을 특정한 수퍼 클래스를 상속받은 클래스 타입으로만
 *           제한하려면 <T: SuperClass>라고 사용
 *
 */

fun main() {
    UsingGeneric(A()).genericShout() // 제네릭 사용시 캐스팅 방지 가능
    UsingGeneric(B()).genericShout()
    UsingGeneric(C()).genericShout()

    genericShout(C())
}

fun <T : A> genericShout(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("Shout out from A")
    }
}

class B : A() {
    override fun shout() {
        println("Shout out from B")
    }
}

class C : A() {
    override fun shout() {
        println("Shout out from C")
    }
}

class UsingGeneric<T : A>(val t: T) {
    fun genericShout() {
        t.shout()
    }
}
