/**
 * nullable 변수에서 null을 처리하는 법
 *  - 일일히 if 문으로 확인하는 것은 비효율적
 *      - ?.(null safe operator): 참조연산자를 실행하기 전에
 *                                먼저 객체가 null인 지 확인 후,
 *                                null일시 뒤따라오는 구문을 실행X.
 *      - ?:(elvis operator): 객체가 null이 아니라면 그대로 사용하지만,
 *                            null이라면 연산자 우측의 객체로 대체된다/
 *
 *      - !!.(non-null assertion operator): 참조연사자 사용 시 null 여부를
 *                                          컴파일시 확인X, 런타임시 null
 *                                          pointer exception이 나도록
 *                                          의도적으로 방치하는 연산자
 *
 * 변수의 동일성 체크
 *  - 내용의 동일성(==): 메모리 상 다르게 할당된 객체여도 내용이 같나면 동일
 *      - ==는 기본 자료형에는 이미 구현되어 있지만,
 *        커스텀 class에는 직접 구현해야함
 *          - open fun equals(other:Any?):Boolean
 *  - 객체의 동일성(===): 서로 다른 변수가 메모리상에 같은 객체를 가리키면 동일
 */

fun main() {
    // nullable 변수에서 null을 처리하는 법
    println("When variable is null")
    var a: String? = null

    println(a?.uppercase())
    println(a ?: "default".uppercase())
    // println(a!!.toUpperCase())

    a?.run {
        println(uppercase())
        println(lowercase())
    }

    println()

    println("When variable is non-null")
    var b: String? = "Some String"

    println(b?.uppercase())
    println(b ?: "default".uppercase())
    println(b!!.uppercase())

    b?.run {
        println(uppercase())
        println(lowercase())
    }

    println()
    // 변수의 동일성 체크
    println("Check variables are same")
    var p1 = Product("Coke", 1000)
    var p2 = Product("Coke", 1000)
    var p3 = p1
    var p4 = Product("Cider", 3000)

    println("p1 and p2")
    println(p1 == p2)
    println(p1 === p2)

    println("p1 and p3")
    println(p1 == p3)
    println(p1 === p3)

    println("p1 and p4")
    println(p1 == p4)
    println(p1 === p4)
}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Product) {
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}
