package ch5.hoon.item32;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GenericArgs {


    public static void main(String[] args) {

        //1. dangerous 호출
        List<String> list1 = new ArrayList<>();
        list1.add("1");

        List<String> list2 = new ArrayList<>();
        list1.add("2");

        //dangerous(list1, list2);

        //2. pickTwo 호출
        //String[] pickArray = pickTwo("좋은", "빠른", "저렴한");   //ClassCastException 발생


        //3. 안전한 메서드
        List<String> flatten = flatten(list1, list2);

    }

    static void dangerous(List<String>... stringLists){
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;
        String s = stringLists[0].get(0);  //stringLists[0]이 intList를 가르키고 있어서 ClassCastException 발생
    }

    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, b);
            case 2: return toArray(a, b);
        }
        throw new AssertionError(); // 도달할 수 없다.
    }

    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }

}
