package ch5.sunmin.item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RawType {
	
	static class Stamp {
		public Stamp() {
			
		}
	}
	
	static class Coin {
		public Coin() {
			
		}
	}
	
	private final static Collection stamps = new ArrayList<>();
	private final static Collection<Stamp> stampsGeneric = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		stamps.add(new Coin());
		
		for(Iterator i = stamps.iterator(); i.hasNext();) {
			Stamp stamp = (Stamp) i.next(); // ClassCastException!
		}
		
//		stampsGeneric.add(new Coin());
		
	}

}
