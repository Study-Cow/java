package ch6.dahye.item39;

import java.util.ArrayList;
import java.util.List;

public class AnnotationSample {
    @Test public static void m1() { }

    @Test public static void m2() {
        throw new RuntimeException("fail");
    }

    /**
     * 정적 메서드가 아님 -> 잘못 적용
     */
    @Test public void m3() { }

    public static void m4(){ }

    @ExceptionTest(ArithmeticException.class)
    public static void m5(){
        int i = 0;
        i = i / i;
    }

    /**
     * 다른 예외 발생 실패
     */
    @ExceptionTest(ArithmeticException.class)
    public static void m6(){
        int[] a = new int[0];
        int i = a[1];
    }

    /**
     * 예외 발생하지 않음 실패
     */
    @ExceptionTest(ArithmeticException.class)
    public static void m7(){ }

    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest( NullPointerException.class)
    public static void doubleBad() {
        List<String> list = new ArrayList<>();
        // IndexOutOfBoundsException, NullPointerException
        list.addAll(5, null);
    }

}
