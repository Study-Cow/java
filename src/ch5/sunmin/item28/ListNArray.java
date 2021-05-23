package ch5.sunmin.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ListNArray {
	
	public static void main(String[] args) {
//		List<String>[] stringLists = new List<String>[1];	// (1)
//		List<Integer> intList = List.of(42);				// (2)
//		Object[] objects = stringLists;						// (3)
//		objects[0] = intList;								// (4)
//		String s = stringLists[0].get(0);					// (5)
	}
	
	public class Chooser<T> {
		private final List<T> choiceList;
		
		public Chooser(Collection<T> choices) { // 로타입을 썼다.
//			choiceArray = (T[]) choices.toArray(); unchecked cast exception
			choiceList = new ArrayList<>(choices);
		}
		
		public Object choose() {
			Random rnd = ThreadLocalRandom.current();
			return choiceList.get(rnd.nextInt(choiceList.size()));
		}
	}

}
