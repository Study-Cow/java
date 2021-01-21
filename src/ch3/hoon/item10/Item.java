package ch3.hoon.item10;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * equals 메서드 재정의 일반 규약
 */
public class Item {

    private String name;

    public Item(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    public static void main(String[] args) {
        Set<Item> set = new HashSet<>();
        Item item1 = new Item("candy");
        set.add(item1);
        System.out.println(set.contains(item1)); // false일 경우, 반사성을 만족하지 못하는 경우이다.

        //1. 반사성
        System.out.println("==반사성 테스트==");
        System.out.println(item1.equals(item1));

        //2. 대칭성
        System.out.println("==대칭성 테스트==");
        Item item2 = new Item("candy");
        System.out.println(item1.equals(item2));
        System.out.println(item2.equals(item1));

        //3. 추이성
        System.out.println("==추이성 테스트==");
        Item item3 = new Item("candy");
        System.out.println(item1.equals(item2));
        System.out.println(item1.equals(item3));
        System.out.println(item2.equals(item3));

    }

}
