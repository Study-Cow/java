package test.ch2.sunmin.item14;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Comparable {
    public static void main(String[] args) {
    	String[] alphabet = {"b", "c", "d"};
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, alphabet);
        System.out.println(s);
    }
}
