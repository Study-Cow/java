package ch5.sunmin.item30;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	
	private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;
	
	@SuppressWarnings("unchecked")
	public static <T> UnaryOperator<T> identityFunction() {
		return (UnaryOperator<T>) IDENTITY_FN;
	}
	
	public static void main(String[] args) {
		String[] strings = {"엠블", "웨이브", "시아코인"};
		UnaryOperator<String> sameString = identityFunction();
		for(String s  : strings) {
			System.out.println(sameString.apply(s)); 
			// UnaryOperator 가 Function 인터페이스를 상속하기 때문에 apply 메서드를 쓸 수 있다.
		}
		
		Number[] numbers = {1, 2.0, 3L};
		UnaryOperator<Number> sameNumber = identityFunction();
		for(Number n : numbers) {
			System.out.println(sameNumber.apply(n));
		}
	}
	
}
