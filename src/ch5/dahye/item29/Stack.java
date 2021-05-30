package ch5.dahye.item29;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

public class Stack<E> {
    // 방법1
//    private E[] elements;

    // 방법2
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 15;

//    방법1
//     elements 배열은 push(E)로 넘어온 E인스턴스만 담는다.
//     타입 안정성을 보장하지만, 런타임 타입은 E[]가 아닌 Object[]이다.
//    @SuppressWarnings("unchecked")
//    public Stack() {
//        방법1
//        elements = (E) new Object[DEFAULT_INITIAL_CAPACITY];
//    }


    // 방법2
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
//      방법1
//        E result = elements[size--];

//        방법2
        @SuppressWarnings("unchecked")
        E result = (E) elements[size--];

        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }
}
