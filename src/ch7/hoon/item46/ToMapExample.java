package ch7.hoon.item46;

import ch7.hoon.item42.Operation;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class ToMapExample {

    public static void main(String[] args) {
        Map<String, Operation> collect = Stream.of(Operation.values())
                .collect(
                        toMap(Object::toString, e -> e)
                );

        for (String s : collect.keySet()) {
            System.out.println("value : " + collect.get(s));
        }
    }

}
