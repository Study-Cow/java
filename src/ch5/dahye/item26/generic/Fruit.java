package ch5.dahye.item26.generic;

import java.util.ArrayList;
import java.util.List;

public class Fruit<T> {
    List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }
}

