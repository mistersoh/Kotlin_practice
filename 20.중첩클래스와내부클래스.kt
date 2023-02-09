/**
 * 중첩 클래스(Nested Class) - 클래스 안에 클래스가 존재
 *                          - 하나의 클래스가 다른 클래스의 기능과
 *                            강하게 연관되어 있다.
 *                          - 형태만 내부에 존재할 뿐 실질적으로 내용 공유불가
 * 내부 클래스 (Inner Class) - 외부 클래스 안의 내부 클래스에 접근하여 사용
 *                          - 외부 클래스의 속성과 함수의 사용이 가능
 *
*/

fun main() {
    println("Call nexted class")
    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    println()
    println("Use inner class")
    inner.introduceInner()
    inner.introduceOuter()

    println()
    println("Make change to outer")
    outer.text = "Change from outer class"
    inner.introduceOuter()
}

class Outer {
    var text = "First outer class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner class"
        fun introduceInner() {
            println("$text")
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}
