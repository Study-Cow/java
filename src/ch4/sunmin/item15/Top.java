package ch4.sunmin.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Top {
	private static final String[] PRIVATE_VALUES = {"I", "HAVE", "PEN"};
	
	public static final List<String> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
	
	public static final String[] values() {
		return PRIVATE_VALUES.clone();
	}
}
