package ch3.hoon.item13;

import java.util.ArrayList;

public class HashTable implements Cloneable{

    private Entry[] buckets = new Entry[100];
    private int size = 0;

    public void printAll(){
        for (int i=0;i<size;i++){
            System.out.println(buckets[i].toString());
        }
    }

    public void put(Entry entry){
        buckets[size++] = entry;
    }

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Entry deepCopy() {
            return new Entry(key, value, next == null ? null : next.deepCopy());
        }

        /*
         * 리스트가 길 경우 stack over flow가 날 수 있으므로 반복문으로도 구현 가능
         */
        /*
        Entry deepCopy() {
            Entry result = new Entry(key, value, next);
            for (Entry p = result; p.next != null; p = p.next)
                p.next = new Entry(p.next.key, p.next.value, p.next.next);
            return result;
        }
         */

    }

    @Override
    protected HashTable clone() {
        try {
            HashTable result = (HashTable) super.clone();
            result.buckets = new Entry[buckets.length];

            for (int i = 0; i < buckets.length; i++) {
                if (buckets[i] != null)
                    result.buckets[i] = buckets[i].deepCopy();
            }

            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        HashTable hashTable1 = new HashTable();
        hashTable1.put(new HashTable.Entry("hoon1", 10, null));

        HashTable.Entry entry1 = new HashTable.Entry("hoon2", 20, null);
        HashTable.Entry entry2 = new HashTable.Entry("hoon3", 30, entry1);
        hashTable1.put(entry2);

        HashTable hashTable2 = hashTable1.clone();

        //실행 결과 Entry까지 복사된걸 볼 수 있음

        System.out.println("============hashTable1===============");
        hashTable1.printAll();

        System.out.println("============hashTable2===============");
        hashTable2.printAll();
    }


}
