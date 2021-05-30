package ch5.dahye.item30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.UnaryOperator;

public class GenericMethodTest {

    private static UnaryOperator<Object> IDNTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    private static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDNTITY_FN;
    }

    @Test
    void genericSingletonEx() {
        String[] strings = {"faker", "keria", "teddy"};
        UnaryOperator<String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }

    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty()) {
            throw new IllegalArgumentException("collection is empty");
        }

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }

        return result;
    }


    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1); // raw type
        result.addAll(s2);
        return result;
    }

    @Test
    void genericMethodEx() {
        Set<String> t1 = Set.of("faker", "keria", "teddy", "cuzz", "canna");
        Set<String> landers = Set.of("choi", "shin", "mac", "joo");

        Set<String> stars = union(t1, landers);
        Assertions.assertEquals(stars.size(), 8);


    }
}
