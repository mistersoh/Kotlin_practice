/**
 * 스코프 함수 - 람다함수를 이용한 특수함수.
 *            - 함수형 언어의 특징을 좀 더 편리하게 
 *              사용할 수 있도록 기본 제공하는 함수
 *              - apply: 인스턴수 생성 후 변수에 담기 전에 초기화
 *                       과정을 수행 할 때 쓰인다.
 *              - run: apply와 비슷하지만 일반 람다함수같이 인스턴스 대신
 *                     마지막 결과값을 반환. 따라서 이미 인스턴스가 
 *                     만들어진 후에 인스턴스의 함수나 속성을 scope내에
 *                     사용해야할 때 유용하다.
 *              - with: run과 동일하지만 인스턴스를 참조연산자 
 *                      대신 패러미터로 받는다
 *              - also/let: apply/run과(와) 동일. 차이점은 마치 
                            * 패러미터로 인스턴스를 넘긴 것 처럼 
                            it을 통해 사용 가능하다. 같은 이름의
                            변수나 함수가 scope 바깥에 중복되어
                            있는 경우에 혼란을 방지하기 위하여.
 * 
 * 
 */

 fun main() {

    // to test also/let
    var name = "The Chronicles of Narnia"
    var price = 30000f

    // apply
    println("------Apply------")
   	var discount_rate:Float = 0.4f
    var a = Book("Lord of Ring", 10000.0f, discount_rate).apply{
        name = "[Discounted] " + name
        discount()
    }

    println(a.name)
    println(a.price)

    // run
    println("------Run------")
    var b = a.run{
        println("Product name is '$name' and price is $price")
        a.price
    }
    println(b)

    // with
    println("------With------")
    with(a){
        println("Product name is '$name' and price is $price")
    }

    // also/let
    println("------Also/Let------")
    a.also{
        println("Product name is '${it.name}' and price is ${it.price}")
    }

    a.let{
        println("Product name is '${it.name}' and price is ${it.price}")
    }
}

open class Book(var name: String, var price: Float, var rate: Float){
    fun discount(){
        price -= (price * this.rate)
    }
}