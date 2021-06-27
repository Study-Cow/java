package ch7.hoon.item45;

import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {     //중간연산
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {  //중간연산
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                }); //종단 연산
        ;
    }

}
