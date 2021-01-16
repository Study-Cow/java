package ch2.hoon.item6;

public class AutoBoxingExample {

    private static long sum1() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    private static long sum2() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {

        //1. long i를 Long타입인 sum에 더할 때 불필요한 Long 인스턴스가 생성되고 자동으로 형변환 된다.
        long start = System.currentTimeMillis();
        AutoBoxingExample.sum1();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        //2. long 타입의 i를 long 타입의 sum에 더하기 때문에 불필요한 인스턴스가 생성되지 않음. 훨씬 빠르다.
        long start2 = System.currentTimeMillis();
        AutoBoxingExample.sum2();
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);

    }

}
