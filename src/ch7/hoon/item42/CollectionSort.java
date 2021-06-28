package ch7.hoon.item42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {

    public static void main(String[] args) {
        //integer 정렬
        List<Integer> list = new ArrayList<>();
        Integer[] arr = {1,5,4,2,3,6,7,8,1};
        list.addAll(Arrays.asList(arr));
        list.sort(Integer::compare);    //자바8에서 List 인터페이스에 추가된 sort 이용
        System.out.println(list);


        //string 정렬
        List<String> words = new ArrayList<>();
        words.add("train");
        words.add("tree");
        words.add("banana");
        words.add("apple");
        words.add("box");

        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);
    }

}
