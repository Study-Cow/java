package ch3.hoon.item10;

import java.util.Objects;

public class Fruit {

    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.name = "apple";

        Apple apple = new Apple();
        apple.name = "apple";

        //상속받은 객체의 경우 값이 같아도 클래스가 다르면 false로 판단
        System.out.println(fruit.equals(apple));    //false

    }

}

class Apple extends Fruit{

}
