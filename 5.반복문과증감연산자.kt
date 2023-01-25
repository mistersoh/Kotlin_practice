/**
 * 연산자의 위치에 따라 연산 순서가 바뀐다.
 * 전위연산자 - 연산이 이미 반영시킨 후 진행
 * 후위연산자 - 연산이 나중에 반영된 후 진행
 * 
 * 반복문
 * do...while - while과 같지만, 최초 한번은 조건없이 
 * do에서 구문을 실행 후 while로 체크한다.
 * for - 범위 내의 반복 (int 및 char 범위도 가능)
 *  step - step 숫자 올라갈때 마다 실행
 *  downTo - downTo 숫자까지 하나씩 내려갈때 마다 실행
 */
fun main() {

  var a = 0
  var b = 4

  do
  {
    println("a for front: ${++a}")
    println("b for back: ${b++}")
  } while(a < 5 && b < 5)

  for (i in 'a'..'z' step 5){
    print(i)
  }

  for (i in 0..30 step 10) {
    for (j in i downTo 0 step 3){
      println(j)
    }
    
  }

}