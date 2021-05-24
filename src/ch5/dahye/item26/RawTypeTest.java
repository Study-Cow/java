package ch5.dahye.item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RawTypeTest {

    static class Coin {
        public void cancle(){
            System.out.println("Coin.cancle");
        }
    }

    static class Stamp {

        public void cancle(){
            System.out.println("Stamp.cancle");
        }
    }

    public static void main(String[] args) {
        Collection stamps = new ArrayList();
        // 매개변수화된 컬렉션 타입
        Collection<Stamp> stamps1 = new ArrayList<>();

        stamps.add(new Stamp());
        stamps.add(new Coin());

        for (Iterator i = stamps.iterator(); i.hasNext();) {
            Stamp stamp = (Stamp) i.next();
            stamp.cancle(); // runtime시  java.lang.ClassCastException오류 발생
        }

        stamps1.add(new Stamp());
//        stamps1.add(new Coin()); // compile 오류 발생 java: incompatible types:
    }


}
