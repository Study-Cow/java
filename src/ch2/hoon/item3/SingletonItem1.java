package ch2.hoon.item3;

/*
 * 1. public static final 필드 방식의 싱글턴 구현
 */
public class SingletonItem1 {
    public static final SingletonItem1 INSTANCE = new SingletonItem1();
    private SingletonItem1(){
        if( INSTANCE != null ) {    //2개 생성 못하도록 방어 로직 작성
            throw new RuntimeException("싱글턴 객체는 1개만 생성 가능합니다.");
        }
    }
}

class SingletonItem1Main {
    public static void main(String[] args) {
        SingletonItem1 singletonItem1 = SingletonItem1.INSTANCE;
    }
}