package ch3.dahye.item13;


import java.util.Arrays;

public class HashTable implements Cloneable{
    private Entry[] buckets = new Entry[10];

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next){
            this.key = key;
            this.value = value;
            this.next = next;
        }


        Entry deepCopy(){
            // 해당 엔트리가 가리키는 연결 리스트를 재귀적으로 복사
            // 재귀 호출이기 때문에, 리스트의 원소 수 만큼 스택 프레임을 소비해 리스트가 길면 스택 오버플로우 발생 위험 있음.
            // return new Entry(key, value, next == null ? null : next.deepCopy());

            // 스택오버플로우 문제를 피하기 위해 반복자를 사용
            Entry result = new Entry(key,value, next);
            for(Entry p = result; p.next != null; p = p.next)
                p.next = new Entry(p.next.key, p.next.value, p.next.next);
            return result;
        }
    }

    /**
     * 잘못된 Clone
     * 원본과 같은 연결 리스트를 참조 해 원본과 복제본 모두 예기치 않게 동작할 가능성 생김
     * @return
     * @Override
     *     public  HashTable clone(){
     *         try{
     *             HashTable result = (HashTable) super.clone();
     *             result.buckets = buckets.clone();
     *             return result;
     *         }catch (CloneNotSupportedException e){
     *             throw new AssertionError();
     *         }
     *     }
     */


    /**
     *
     * @return
     */
    @Override
    public  HashTable clone(){
        try{
            HashTable result = (HashTable) super.clone();
            result.buckets = new Entry[buckets.length];
            for(int i =0 ; i < buckets.length; i++){
                if(buckets[i] != null){
                    result.buckets[i] = buckets[i].deepCopy();
                }
            }
            return result;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
