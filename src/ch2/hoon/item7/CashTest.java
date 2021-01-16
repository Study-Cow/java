package ch2.hoon.item7;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CashTest {

    public static void main(String[] args) {
        // 1. 참조를 끊을 경우
        Map<Foo, String> map = new HashMap<>();
        Foo key = new Foo();
        map.put(key, "1");
        //when
        key = null;
        System.gc();
        //then
        System.out.println(map.isEmpty());  //HashMap 은 참조를 끊어도 map 이 비어있지 않다.


        // 2. 참조를 끊을 경우
        Map<Foo, String> map2 = new WeakHashMap<>();
        Foo key2 = new Foo();
        map.put(key2, "1");
        //when
        key2 = null;
        System.gc();
        //then
        System.out.println(map2.isEmpty());  //WeakHashMap 은 참조를 끊으면 map 이 비어있다.
    }

}
