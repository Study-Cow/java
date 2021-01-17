package test.ch2.sunmin.item8;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import ch2.sunmin.item8.FinalizeObject;

public class FinalizeObjectTest {
	@Test
	public void whenGC_thenFinalizerExecuted() throws IOException {
	    String firstLine = new FinalizeObject().readFirstLine();
	    assertEquals("baeldung.com", firstLine);
	    
	    System.gc();
	}
}
