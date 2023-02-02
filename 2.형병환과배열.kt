
/**
 * 형변환 함수 종류 (명시적 형변환만 허용)
 * toByte(): byte로 변환
 * toShort(): short로 변환
 * toInt(): int로 변환
 * toLong(): long으로 변환
 * toFloat(): float으로 변환
 * toDouble(): double로 변환
 * toChar(): char로 변환
 */

/**
 * 배열은 Array 클래스 사용 (arrayOf<Generic>)
 * 참조할 index는 0 부터 시작
 * 처음 선언했을 때의 전체 크기를 변경 불가, 대신 빠른 입출력 가능
 */

fun main() {
    val a: Int = 1231
    var b: Long = a.toLong()
    println(b)

    var intArr = arrayOf(1, 2, 3, 4)
    var nullArr = arrayOfNulls<Int>(5) // 빈 배열, 꺽쇠 안에는 배열에 할당할 자료형 지정
    println(intArr[3])
}
