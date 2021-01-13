package ch2.hoon.item3;

/*
 * 2. 정적 팩터리 방식의 싱글턴 구현
 */
public class SingletonItem2 {
    private static final SingletonItem2 INSTANCE = new SingletonItem2();
    public static SingletonItem2 getInstance() {
        return INSTANCE;
    }
    private SingletonItem2() {
        if( INSTANCE != null ) {    //2개 생성 못하도록 방어 로직 작성
            throw new RuntimeException("싱글턴 객체는 1개만 생성 가능합니다.");
        }
    }
}

class SingletonItem2Main {
    public static void main(String[] args) {
        SingletonItem2 singletonItem2 = SingletonItem2.getInstance();
    }
}