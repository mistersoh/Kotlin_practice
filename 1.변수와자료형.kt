/* var val 차이
 * var - 일반적으로 통용되는 변수, 언제든지 읽기 쓰기가 가능
 * val - 선언시에만 초기화 가능, 중간에 변경 불가
 */

 /* 자료형 (자바와 거의 동일)
  * 숫자형
  * 정수형 - Byte(8bits), Short(16bits), Int(32bits), Long(64bits
  * 실수형 - Float(32bits), Double(64bits)
  * kotlin에서 8진수 표기는 지원하지 않는다
  * 문자형 - char(UTF16,2bytes/16bits)
  * 논리형 - Boolean(True/False)
  * Any - 어떤 자료형이든 상관없는 최상위 자료형
  */
fun main() {
  //null
  var c:Int? = null //nullable 변수 선언, null 상태로 연산시 null exception

  //정수형
  val intA:Int = 100
  var longVal:Long = 1234L
  var intValHex:Int = 0x1af
  var intValBin:Int = 0b10111

  //실수형
  var floatb:Float = 50.0f
  val doubleVal:Double = 1241.4
  var doubleValWithExp:Double = 1234.5e10
  
  //문자형
  var charA:Char = 'A'

  //논리형
  var bool:Boolean = true

  //문자열
  var singleLine = "this is single line"
  val multiLine = """for
  multiple
  lines"""
} 