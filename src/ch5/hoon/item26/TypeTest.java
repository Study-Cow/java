package ch5.hoon.item26;

import java.util.ArrayList;
import java.util.List;

public class TypeTest {

    private static void addtoObjList(final List<Object> list, final Object o) {
        list.add(o);
    }

    private static void addToWildList(final List<?> list, final Object o) {
        // null 외에 허용되지 않는다
        //list.add(o);
    }

    private static <T> void addToGenericList(final List<T> list, final T o) {
        list.add(o);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = "kimtaeng";

        // 아무 타입이나 Okay! 하지만 메서드에서 오류
        addToWildList(list, s);

        // List<Object> 이므로 incompatible types 오류
        //addtoObjList(list, s);

        // Okay!
        addToGenericList(list, s);
    }

}
