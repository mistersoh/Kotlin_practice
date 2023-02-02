/**
 * 리스트 - 데이터를 코드에서 지정한 순서대로 저장해두는 것
 *        - collection class의 서브 클래스 중 가장 단순한
 *          여러 개의 데이터를 원하는 순서로 넣어관리하는 형태
 *              - List<out T> (ListOf()):
 *                생성 시 넣은 객체를 추가/삭제/편집 불가
 *              - MutableList<T> (mytableListOf()):
 *                생성 시 넣은 객체를 추가/삭제/편집 가능
 *                  - add(인덱스/데이터): 요소 추가
 *                  - remove(데이터)/removeAt(인덱스): 요소 삭제
 *                  - shuffle(): 무작위 섞기
 *                  - sort(): 정렬
 *                  - list[인덱스]: 해당 위치 요소 대체
 */

fun main() {
    val a = listOf("Apple", "Orange", "Banana")
    println(a[2])

    for (i in a) {
        println("$i")
    }

    println()

    println("original mutable list")
    val b = mutableListOf(1, 3, 5)
    println(b)

    println("add")
    b.add(6)
    println(b)

    println("add with index")
    b.add(3, 9)
    println(b)

    println("remove")
    b.remove(1)
    println(b)

    println("remove with index")
    b.removeAt(1)
    println(b)
}
