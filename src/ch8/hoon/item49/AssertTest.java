package ch8.hoon.item49;

public class AssertTest {

    public static void main(String[] args) {
        long[] a = null;

        sort(a, -5, -3);
    }

    private static void sort(long a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
        //계산 수행 ...
    }

}
