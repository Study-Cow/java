package ch2.sunmin.item6;

import java.util.regex.Pattern;

public class ItemStringValidUtil {
	
	private static final Pattern APPE_PROP_CNTT = Pattern.compile("^[A-Za-z0-9\\-]*$");
	private static final Pattern ITEM_NM = Pattern.compile("^[`~!@#$%^&*()-=_+\\\\[\\\\]{}:;',./<>?\\\\\\\\|]*$");
	
	static boolean isValidItemAppePropCntt(String s) {
		return APPE_PROP_CNTT.matcher(s).matches();
	}
	
	static boolean isValidItemNm(String s) {
		return ITEM_NM.matcher(s).matches();
	}
	
	static boolean isValidItemAppePropCnttSlow(String s) {
		return s.matches("^[A-Za-z0-9\\\\-]*$");
	}
	
	public static void main(String[] args) {
        int numSets = Integer.parseInt(args[0]);
        int numReps = Integer.parseInt(args[1]);
        boolean b = false;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            for (int j = 0; j < numReps; j++) {
                // 성능 차이를 확인하려면 xxxSlow 메서드를 xxxFast 메서드로 바꿔 실행해보자.
                b ^= isValidItemAppePropCntt("!@#");
            }
            long end = System.nanoTime();
            System.out.println(((end - start) / (1_000. * numReps)) + " μs.");
            System.out.println(b);
        }

        // VM이 최적화하지 못하게 막는 코드
        if (!b)
            System.out.println();	
	}

}
