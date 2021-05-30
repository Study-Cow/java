package ch5.dahye.item26;

import java.io.Serializable;
import java.util.*;

public class ListRawTypeTest {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

//        unsafeAdd(strings, Integer.valueOf(100));
//        String s = strings.get(0);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("sdfjklsd");
        Set<Integer> intSet = new HashSet<>();
        intSet.add(Integer.valueOf(30));

        numElemnetsInCommon(intSet, stringSet);

        Collection<?> collection = new ArrayList<>();
        // parameter로 Generic이 설정되어있어 null만 받을 수 있음.
        collection.add(null);
//        collection.add("testse");

    }

    private static void unsafeAdd(List<Object> list, Object o) {
        list.add(o);
    }

    static int numElemnetsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }
        return result;
    }


}
