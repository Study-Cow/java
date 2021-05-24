package ch5.sunmin.item26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RawTypeMethod {
	
	private static void unsafeAdd(List list, Object o) {
		list.add(o);
	}
	
	public static void main(String[] args) {
//		List<String> strings = new ArrayList<>();
//		unsafeAdd(strings, Integer.valueOf(42));
//		String s = strings.get(0);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(Integer.valueOf(10));
		Set<Integer> set2 = new HashSet<>();
		set2.add(Integer.valueOf(25));
		
		System.out.println(numElementsInCommon(set1, set2));
		
		Object o = new Object();
		if(o instanceof Set) { // 로타입			
			Set<?> s = (Set<?>) o; // 와일드타입으로 형변환			
		}
		
//		if(o instanceof Set<String>) { // 제너릭 -> 오류 발생!			
//			Set<?> s = (Set<?>) o; // 와일드타입으로 형변환			
//		}
				
	}
	
	private static int numElementsInCommon(Set<?> s1, Set<?> s2) {
		
//		s1.add("Not Integer String");
		
		int result = 0;
		for (Object o1 : s1) {
			if(s2.contains(o1)) {
				result ++;
			}
		}
		return result;		
	}

}
