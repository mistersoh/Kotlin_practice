/**
 *
 */

fun main() {
    val test1 = "Test.String.Practice"

    // 문자열 길이
    println("Print length of string")
    println(test1.length)

    // 대,소문자 변환
    println("To upper/lower case")
    println(test1.uppercase())
    println(test1.lowercase())

    // 문자열 분리
    println("Split")
    val test2 = test1.split(".")
    println(test2)

    // 문자열 배열 합치기
    println("Join strings array")
    println(test2.joinToString()) // 그냥 합치기
    println(test2.joinToString("&")) // & 넣어 합치기

    // 문자열 일부분만 사용
    println("Use substring")
    val start = 3
    val end = 10
    println(test1.substring(start..end))

    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    // 문자열 비어있는 지 확인
    println("Check if string is null")
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println("Check if string is blank")
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    // 문자열이 특정 문자열을 포함하는 지 확인
    var test3 = "kotlin.kt"
    var test4 = "String.Container"
    println("Use substrings")
    println(test3.startsWith("kotlin"))
    println(test4.startsWith("kotlin"))
    println(test3.endsWith("kt"))
    println(test4.endsWith("kt"))
    println(test3.contains("tli"))
    println(test4.contains("tli"))
}
