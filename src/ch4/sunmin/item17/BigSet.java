package ch4.sunmin.item17;

import java.math.BigInteger;
import java.util.BitSet;

public class BigSet {
	public static void main(String[] args) {
		BigInteger moby = new BigInteger("100");
		moby = moby.flipBit(0);
		
		BitSet bitSet = new BitSet(100);
		bitSet.flip(0);		
		
	}
}
