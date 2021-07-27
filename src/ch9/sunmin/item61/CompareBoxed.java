package ch9.sunmin.item61;

import java.util.Comparator;

public class CompareBoxed {
	
	static Integer i;
	
	public static void main(String[] args) {
		Comparator<Integer> naturalOrder = (i,j) -> (i<j) ? -1 : (i == j ? 0 : 1);
		
		System.out.println(naturalOrder.compare(new Integer(42), new Integer(42)));
		
//		if(i == 42) { // NullPointerException
//			System.out.println("Unbelivable");
//		}
		
		Long sum = 0L;
		for(long i=0; i<= Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
	
	}
}
