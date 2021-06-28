package ch7.sunmin.item43;

import java.util.HashMap;
import java.util.Map;

public class MethodReference {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.merge(1, 1, (oldVal, newVal) -> oldVal + newVal);
		map.merge(1, 1, (oldVal, newVal) -> oldVal + newVal);
		map.merge(1, 1, (oldVal, newVal) -> oldVal + newVal);
		
		map.merge(2, 1, (oldVal, newVal) -> oldVal + newVal);
		map.merge(2, 1, Integer::sum);
		
		System.out.println(map.toString());
	}
}
