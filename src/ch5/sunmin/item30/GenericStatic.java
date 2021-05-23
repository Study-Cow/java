package ch5.sunmin.item30;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class GenericStatic {
	
	public static void main(String[] args) {
		Set<String> set = Collections.emptySet();
		System.out.println(set);
		
		Comparator<Integer> reverseComparator = Collections.reverseOrder();
		System.out.print(reverseComparator.compare(Integer.valueOf(-1), Integer.valueOf(1)));
		
	}
	
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
	
//	public static <E extends Comparable<E>> E max(Collection<E> c);

}
