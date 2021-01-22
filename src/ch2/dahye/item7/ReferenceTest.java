package ch2.dahye.item7;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

public class ReferenceTest {

    public static void main(String[] args){

        HashMap<Integer, String> hashMap = new HashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;
        Integer key3 = 3000;
        hashMap.put(key3, "test c");
        hashMap.put(key2, "test b");

        key3 = null;

        System.out.println("HashMap GC 수행 이전");
        hashMap.entrySet().stream().forEach(el -> System.out.println(el));

        System.gc();

        System.out.println("HashMap GC 수행 이후");
        hashMap.entrySet().stream().forEach(el -> System.out.println(el));

        WeakHashMap<Integer, String> map = new WeakHashMap<>();

        map.put(key1, "test a");
        map.put(key2, "test b");

        key1 = null;

        System.out.println("WeakHashMap GC 수행 이전");
        map.entrySet().stream().forEach(el -> System.out.println(el));

        System.gc();

        System.out.println("WeakHashMap GC 수행 이후");
        map.entrySet().stream().forEach(el -> System.out.println(el));




    }
}
