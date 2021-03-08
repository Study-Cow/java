package ch5.hoon.item26;

import java.util.ArrayList;
import java.util.List;

public class UnsafeAdd {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        //List<Object> 사용시 List 사용 보다 좀더 type safe
        //unsafeAdd(strings, Integer.valueOf(42));  //주석 해제하면 컴파일 시점에 type 체크하는거 볼 수 있음
        String s = strings.get(0);
    }

    // List<Object>
    private static void unsafeAdd(List<Object> list, Object o) {
        list.add(o);
    }

}
