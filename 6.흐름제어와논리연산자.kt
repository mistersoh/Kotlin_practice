/**
 * 흐름제어용 키워드
 * return - 함수 종료 및 값 반환
 * break - 반복문 내의 구문이 실행되는 중간에 즉시 반복문을 종료하고
 *         다음 구문으로 넘어간다
 * continue - 다음 반복조건으로 즉시 넘어간다
 * @ - @과 레이블 이름을 달면 레이블이 달린 반복문을 기준으로 즉시 시동
 * 
 * 논리연산자
 * && - AND
 * || - OR
 * ! - NOT
 */
fun main() {

  for (i in 0..10) {
    if(i==3) {
      println("Met the continue condition")
      continue
    }
    if(i==7) {
      println("Met the break condition")
      break
    }
    println(i)
  }

  loop@for (i in 1..10){
    for (j in 1..i){
      if(i==4 && j==2) {
        println("Stop at this point")
        break@loop
      }
      if(i+j==2 || j-i==1) {
        println("Two values are valuable")
        continue@loop
      }
      println("i is $i and j is $j")
    }
  }

}