package ch4.sunmin.item32;

import java.util.ArrayList;
import java.util.List;

public class Dangerous {

	public static void dangerous(List<String>... stringLists) {
		List<Integer> intList = List.of(42);
		Object[] objects = stringLists; 	// Object[0] 에는 String이 들어가 있음
		objects[0] = intList; 				// Object[0]의 원소를 intList로 바꿔버림 -> stringLists도 intList로 변경됨(참조) 힙 오염 발생
		String s = stringLists[0].get(0);	// java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
	}
	
	public static void main(String[] args) {
		List<String> test = new ArrayList<String>();
		test.add("test");
		dangerous(test);
	}
	
}
