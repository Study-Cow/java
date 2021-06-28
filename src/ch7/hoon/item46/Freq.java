package ch7.hoon.item46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Freq {

    public static void main(String[] args) throws FileNotFoundException {

        /* 1. 스트림을 제대로 사용하지 못하고 있는 코드 */
        File file = new File("./words.txt");
        // 코드 46-1 스트림 패러다임을 이해하지 못한 채 API만 사용했다 - 따라 하지 말 것! (277쪽)
        Map<String, Long> freq = new HashMap<>();
        try (Stream<String> words = new Scanner(file).tokens()) {
            words.forEach(word -> {
                freq.merge(word.toLowerCase(), 1L, Long::sum);
            });
        }
        System.out.println(freq);

        /* 2. 스트림을 제대로 사용하고있는 코드 */
        Map<String, Long> freq2 = new HashMap<>();
        try (Stream<String> words = new Scanner(file).tokens()) {
            freq2 = words.collect(groupingBy(String::toLowerCase, counting()));
        }
    }

}