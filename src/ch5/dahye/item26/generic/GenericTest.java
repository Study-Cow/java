package ch5.dahye.item26.generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class GenericTest {

    @Test
    void compileTimeExceptionTest() {
        Person<Employee> person = new Person<>(new Employee(10));
        Employee employee = person.info;
        Assertions.assertEquals(10, employee.rank);

        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
        List<Integer> ints = new ArrayList<>();

        List<? extends Number> numbers = ints;

//        numbers.add(Double.valueOf(3.14));
        numbers.add(null);
    }

    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void printList2(List<? extends Number> list) {
        for (Number elem : list) {
            System.out.println(elem);
        }
    }

    static class Employee {
        public int rank;
        Employee(int rank){ this.rank = rank; }
    }

    static class Person<T> {
        public T info;
        Person(T info){ this.info = info; }
    }

    public static void main(String[] args) {
        Fruit<Apple> appleBox = new Fruit<>();
        List<String> strings = new ArrayList<>();
        strings.add("1234");
        strings.add("test");


        printCollection(strings);
        printCollectionUnbounded(strings);



    }

    static void printCollection(Collection<? extends Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    static void printCollectionUnbounded(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    public <T extends Apple> void genericMethod(T t) {

    }
}
