##[item11] equals를 재정의하려면 hashCode도 재정의하라

###1. 내용 정리
* https://insight-bgh.tistory.com/387

###2. 주의해야할 점
 * IDE로 equals와 hash code 재정의 시 클래스에 멤버 변수를 추가할 때 equals와 hash code 재정의가 되어있는지 확인 필요할듯
 * IDE로 재정의하기 보다는 핵심필드만 골라서 롬복 어노테이션으로 재정의하는게 유리할듯