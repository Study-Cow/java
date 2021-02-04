package test.ch2.sunmin.item11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

public class HashCode {
	
	public static class PhoneNumber implements Cloneable{
		private final short areaCode, prefix, lineNum;
		
		public PhoneNumber(int a, int b, int c) {
	        this.areaCode = (short) a;
	        this.prefix   = (short) b;
	        this.lineNum  = (short) c;
		}
		
	    // 코드 11-2 전형적인 hashCode 메서드 (70쪽)
	    @Override public int hashCode() {
	        int result = Short.hashCode(areaCode);
	        result = 31 * result + Short.hashCode(prefix);
	        result = 31 * result + Short.hashCode(lineNum);
	        return result;
	    }

	    // 코드 11-3 한 줄짜리 hashCode 메서드 - 성능이 살짝 아쉽다. (71쪽)
//	    @Override public int hashCode() {
//	        return Objects.hash(lineNum, prefix, areaCode);
//	    }

//	    // 해시코드를 지연 초기화하는 hashCode 메서드 - 스레드 안정성까지 고려해야 한다. (71쪽)
//	    private int hashCode; // 자동으로 0으로 초기화된다.
	//
//	    @Override public int hashCode() {
//	        int result = hashCode;
//	        if (result == 0) {
//	            result = Short.hashCode(areaCode);
//	            result = 31 * result + Short.hashCode(prefix);
//	            result = 31 * result + Short.hashCode(lineNum);
//	            hashCode = result;
//	        }
//	        return result;
//	    }
	    
	    @Override public PhoneNumber clone() {
	        try {
	            return (PhoneNumber) super.clone();
	        } catch (CloneNotSupportedException e) {
	            throw new AssertionError();  // 일어날 수 없는 일이다.
	        }
	    }
		
	}
	
	public static void main(String[] args) {
		Map<PhoneNumber, String> m = new HashMap<>();
		m.put(new PhoneNumber(707, 867, 5309), "제니");
		m.get(new PhoneNumber(707, 867, 5609)); // return null
		
		HashSet<String> hashSet = new HashSet<>();
		TreeSet<String> treeSet = new TreeSet<>(hashSet);
	}
	
}
