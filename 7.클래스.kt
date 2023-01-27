/**
 * 클래스란
 * 값과 그 값을 사용하는 기능들을 묶어놓은 것
 *  속성(고유의 특징값) + 함수(기능의 구현)
 * 인스턴스의 틀
 *  인스턴스란? 클래스를 이용해서 만들어 내는 서로 다른 속성의 객체를 지칭
 * 
 * 상속은
 *   1) 기존 코드를 확장하여 새로운 클래스를 만들 때
 *   2) 여러 클래스 중 공통점을 뽑아 코드관리를 편하게 할 때
 * 쓴다.
 * 
 */
fun main() {

    var personA = Male("Wuntyu", 1990)
    var personB = Male("Veetol", 1993)
    var personC = Female("Zentena", 1989)

    val arrPeople = arrayOf(personA,personB,personC)

    for (i in arrPeople) {
        i.introduce()
    }

    var personD = Person("Leewis")

    println("Finished self introduce")
}

// Apply singleton
object singletonCount{
    var count = 0
}

//코틀린에서는 상속 금지가 기본값이므로 open을 통하여 열어줘야 한다
open class Person(var name:String, val birthYear:Int, val sex:String) {
    init{
        println("A new person ${this.name} has arrived. Total is ${++singletonCount.count}")
    }

    constructor(name:String) : this(name, 0, ""){
        println("$name doesn't know own birthday")
    }

    fun introduce(){
        println("Hello I'm $name, born in $birthYear and I'm $sex.")
    }
}

/**
 * 서브클래스는 수퍼클래스에 존재하는 속성과 같은 이름의
 * 속성(var, val 등)을 가질 수 없다 
 * 그리고 서브클래스가 생성 될 때 반드시
 * 수퍼클래스의 생성자까지 호출 되어야 함.
 */

class Male(name:String, birthYear:Int) : Person(name, birthYear, "Male"){
    
}

class Female(name:String, birthYear:Int) : Person(name, birthYear, "Female"){

}