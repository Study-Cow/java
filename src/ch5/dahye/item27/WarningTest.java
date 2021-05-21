package ch5.dahye.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WarningTest {
    private int size;
    private String[] elements;

    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            @SuppressWarnings("unchecked") T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();


    }
}
