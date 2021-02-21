##[item18] 상속보다는 컴포지션을 사용하라

###1. 내용 정리
* https://insight-bgh.tistory.com/402

##2. 궁금한점
* 상속하지말라고 했으면서 InstrumentedSet은 왜 ForwardingSet을 상속하는지
  ForwardingSet 클래스를 래퍼클래스에서 다시 컴포지션으로 사용하면 안되는 거임???
* 전달 클래스 이외에 InstrumentedSet 이라는 래퍼 클래스를 사용한 이유.
  ForwardingSet 클래스를 그냥 쓰면 안되나??