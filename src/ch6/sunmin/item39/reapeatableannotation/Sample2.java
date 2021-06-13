package ch6.sunmin.item39.reapeatableannotation;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {
	
	@ExceptionTest(ArithmeticException.class)
	public static void m1() {
		int i = 0;
		i = i / i;
	}
	
	@ExceptionTest(ArithmeticException.class)
	public static void m2() { // 실패해야 한다. IndexOutOfArray.class가 나야 한다.
		int[] a = new int[0];
		int i = a[1];
	}
	
	@ExceptionTest(ArithmeticException.class)
	public static void m3() {} // 실패해야 한다. (예외가 발생하지 않음)
	
	@ExceptionTest(IndexOutOfBoundsException.class)
	@ExceptionTest(NullPointerException.class)
	public static void doubleBad() {
		List<String> list = new ArrayList<>();		
		list.addAll(5, null);
	}

}
