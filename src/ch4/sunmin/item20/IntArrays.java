package ch4.sunmin.item20;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class IntArrays {
	
	// public interface List<E>
	static List<Integer> intArrayAsList(int[] a) {
		Objects.requireNonNull(a);
		
		// public abstract class AbstractList<E>
		return new AbstractList<Integer>() { // 익명 클래스 형태

			@Override
			public Integer get(int index) {
				return a[index];
			}

			@Override
			public int size() {
				return a.length;
			}
			
			@Override
			public Integer set(int i, Integer val) {
				int oldVal = a[i];
				a[i] = val;
				return oldVal;
			}
			
		};
	}

}
