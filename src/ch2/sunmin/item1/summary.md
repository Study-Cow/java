## [item1] 생성자 대신 정적 팩터리 메서드를 고려하라

[블로그 포스팅 완료](https://mongsil1025.github.io/book/effective-java/item1/)

일반적으로 클래스의 인스턴스를 얻기위해 생성자를 쓴다. 이러한 생성자와 별도로 `정적 팩터리 메서드(static factory method)`를 제공할 수 있다.

정적 팩터리 메서드란 **객체 생성을 캡슐화하는 기법** 이다.

예를 들어, `boolean` 기본 타입의 boxed clss 인 Boolean을 보면 아래와 같이 구현되어 있다.

```java

public static final Boolean TRUE = new Boolean(true);
public static final Boolean FALSE = new Boolean(false);

public static Boolean valueOf(String s) {
    return parseBoolean(s) ? TRUE : FALSE;
}
public static Boolean valueOf(boolean b) {
    return (b ? TRUE : FALSE);
}
```

생성자로 instance를 만들어서, `valueOf` 메서드에 접근하는 것이 아니라 `Boolean.valueOf` 이렇게 바로 static으로 사용한다.

## 정적 팩터리 메서드의 장점

- 이름을 가질 수 있다.
- 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
- return 타입의 **하위 타입 객체**를 반환할 수 있는 능력이 있다.
	- 하나의 메소드에, 조건에 따라 반환하는 객체를 달리 할 수 있다는 뜻
- 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
	- 세번째 장점과 동일한 맥락
- 정적 팩터리 메서드를 작성하는 시점에는 바노한할 객체의 클래스가 존재하지 않아도 된다.
	- 이 부분은 예제로 JDBC를 들었는데, 정적 팩터리 메서드를 작성할 시점에 객체의 클래스를 지정하지 않아도 되므로 유연하다라는 의미인 것 같다.(?)
	
## 정적 팩터리 메서드의 단점

- 상속이 불가하다.
	- 상속하려면 무조건 `public`이나 `protected` 생성자가 필요하다.
- 정적 팩터리 메서드는 프로그래머가 찾기 어렵다.
	- 생성자처럼 `new`를 통해 바로 인스턴스를 반환받는 것이 아니라 널리 알려진 규약 및 메서드를 구굴링해서 찾아봐야 한다.
	
> Summary : 메소드가 자주 호출되어 캐싱해서 쓸 수 있는 경우, 메소드의 구현이 불변할 경우 (유틸리티 성향의 메소드들) 는 생성자 대신 정적 팩터리 메서드로 구현해도 좋을 것 같다.