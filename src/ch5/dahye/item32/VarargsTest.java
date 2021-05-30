package ch5.dahye.item32;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class VarargsTest {

    @Test
    void varargsErrTest() {
        List<String> strings = new ArrayList<>();
        strings.add("test");
        dangerous(strings);
    }
    static void dangerous(List<String>... stringLists) {
        List<Integer> ints = List.of(42);
        Object[] objs = stringLists;
        objs[0] = ints; // 힙오염
        String s = stringLists[0].get(0); // runtime error - ClassCastException

    }

    @Test
    void heapPollutionTest() {
        List<String> stringListA = new ArrayList<String>();
        List<String> stringListB = new ArrayList<String>();

        ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
        ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
        List<List<String>> listOfStringLists = new ArrayList<List<String>>();
        ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);
        ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
    }

    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(b, c);
        }
        throw new AssertionError();
    }

    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }

        return result;
    }
}
