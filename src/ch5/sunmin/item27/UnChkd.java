package ch5.sunmin.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnChkd {
	
	public static void main(String[] args) {
		Set<String> exaltation = new HashSet();
	}
	
//    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
    	int size = 0;
    	Object[] elementData = null;
    	
        if (a.length < size) {
            // Make a new array of a's runtime type, but my contents:        	
        	@SuppressWarnings("unchecked") T[] result = (T[]) Arrays.copyOf(elementData, size, a.getClass()); 
            return result;
        }

        System.arraycopy(elementData, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

}
