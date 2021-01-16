##[item3] private 생성자나 열거 타입으로 싱글턴임을 보증하라

###1. 내용 정리
* https://insight-bgh.tistory.com/373

##2. 싱글턴 활용 예시
 * DBCP(Database Connection Pool)처럼 공통된 객체를 생성해서 사용해야하는 상황
 * 스프링에서 빈으로 주입하는 서비스 클래스 등등