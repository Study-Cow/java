package ch4.sunmin.item19;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class Sub extends Super{
	
	private final Instant instant;
	
	Sub() {
		instant = Instant.now();
	}
	
	@Override public void overrideMe() { // 상위클래스의 생성자가 호출한다.
		System.out.println(instant);
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.overrideMe();
		
		Collection<?> collection = new ArrayList<>();
//		collection.add("test");
		
		collection.clear();
		collection.contains("test");
		
//		collection.add(null);
		
	}

}
