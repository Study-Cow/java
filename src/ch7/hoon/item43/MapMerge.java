package ch7.hoon.item43;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MapMerge {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer key = 1;
        map.put(2, 5);
        map.merge(key, 1, (count, incr) -> count+incr);
        System.out.println(map.get(key));

        map.merge(2, 1, Integer::sum);
        System.out.println(map.get(2));


        LocalDate targetDate = LocalDate.now();
        Predicate<LocalDate> localDateUnaryOperator = targetDate.minusDays(1)::isAfter;

    }

}
