package test.ch2.sunmin.item6;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Foo {
	
}

class HashMapReferenceTest {
	
	@DisplayName("HashMap 테스트")
    @Test
    void HashMapTest() throws InterruptedException {
        //given
        Map<Foo, String> map = new HashMap<>();

        Foo key = new Foo();
        map.put(key, "1");

        //when
        key = null;
        System.gc();
        
        TimeUnit.SECONDS.sleep(5);
        
        assertFalse("HashMap 은 참조를 끊어도 Map이 비어있지 않다.", map.isEmpty());
    }
    
    @DisplayName("WeakHashMap 테스트")
    @Test
    void test2() throws InterruptedException {
        //given
        Map<Foo, String> map = new WeakHashMap<>();

        Foo key = new Foo();
        map.put(key, "1");

        //when
        key = null;
        System.gc();
        
        TimeUnit.SECONDS.sleep(5);
        
        assertTrue("WeakHashMap은 참조를 끊으면 GC에 의해 MAP이 비어진다", map.isEmpty());
    }
    
    @DisplayName("WeakHashMap String 테스트")
    @Test
    void test3() throws InterruptedException {
    	
    	Map<String, String> map = new WeakHashMap<>();
    	
    	String s1 = new String("ITEM");
    	String s2 = new String("SITE_ITEM");
    	
//    	String s1 = "ITEM";
//    	String s2 = "SITE_ITEM";
    	
    	map.put(s1, "123");
    	map.put(s2, "987");
    	
    	s1 = "";
    	System.gc();
    	
    	TimeUnit.SECONDS.sleep(5);
    	
    	assertTrue(map.get("ITEM") == null);
    	
    }

}
