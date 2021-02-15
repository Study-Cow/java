package ch4.dahye;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class SkeletonImplementation {
    static List<Integer> intArrayAsList(int[] a){
        Objects.requireNonNull(a);

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };

    }
}
