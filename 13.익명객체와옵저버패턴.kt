/**
 * 옵저버 패턴- 이벤트(트리거)가 일어나는 것 감시(옵저버)하고
 *             발생마다 즉잦적으로 처ㄹ할 수 있도록 만드는
 *             프로그래밍 패턴
 *              - 이벤트 수신 클래스
 *              - 이벤트 발생 및 전달용 클래스
 *              - 상기 두 클래스 사이를 참조할 수 있도록 인터페이스(listener) 추가
 *              - 이벤트를 넘겨주는 행위 = 콜백
 *
 * 임명객체 - EventListener를 상속받아 구현하지 않고 임시로 만들어 대신 넘겨 받는것
 */

fun main() {
    EventPrinter().start()
    EventPrinterTemp().startTemp()
}

interface EventListener {
    // 리스너를 통해 이벤트를 반환하는 함수는 'on'을 붙이는 게 관례이다.
    fun onEvent(count: Int)
}

class Counter(var listener: EventListener) {
    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter : EventListener {
    override fun onEvent(count: Int) {
        println("$count")
    }

    fun start() {
        val counter = Counter(this) // EventPrinter 객체 자신을 나타냄
        counter.count()
    }
}

class EventPrinterTemp {
    fun startTemp() {
        val counterTemp = Counter(object : EventListener {
            override fun onEvent(count: Int) {
                println("$count for temp")
            }
        })
        counterTemp.count()
    }
}
