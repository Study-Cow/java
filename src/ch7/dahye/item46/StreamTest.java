package ch7.dahye.item46;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class StreamTest {
    @Test
    void collectorTest() {
        File file = new File("words.txt");
        Stream<String> words = Stream.of("dahye", "Dahye", "faker", "Faker", "FAKER", "t1", "lol");

        Map<String, Long> freq = words.collect(groupingBy(String::toLowerCase, counting()));

        List<String> topTwo = freq.keySet().stream()
                .sorted(Comparator.comparing(freq::get).reversed())
                .limit(2)
                .collect(toList()); // List 형태로 반환

        topTwo.forEach(i->System.out.println(i));
    }

}
