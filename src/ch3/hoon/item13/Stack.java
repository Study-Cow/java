package ch3.hoon.item13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;  //다 쓴 참조 해제
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    @Override
    protected Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone(); //Object의 주소는 다르지만 Object안에 담겨있는 객체들의 레퍼런스는 같음
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) throws Exception{
        Stack s1 = new Stack();
        s1.push(new Foo(10));
        s1.push(new Foo(20));
        Stack s2 = s1.clone();

        while (s1.size != 0){
            Foo foo = (Foo)s1.pop();
            foo.setFoo(40); //s2에서 참조하고있는 foo 객체도 데이터 바뀌는거 볼 수 있음
        }

        while (s2.size != 0){
            System.out.println(s2.pop().toString());
        }

    }

}