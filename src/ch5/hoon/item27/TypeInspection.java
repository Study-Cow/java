package ch5.hoon.item27;

import ch2.hoon.item4.Item;

import java.util.HashSet;
import java.util.Set;

public class TypeInspection {


    public static void main(String[] args) {

        @SuppressWarnings("unchecked")
        Set<Item> item = new HashSet<>();

        System.out.println(item);
    }

}
