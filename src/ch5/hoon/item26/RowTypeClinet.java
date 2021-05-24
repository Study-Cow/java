package ch5.hoon.item26;

import java.util.ArrayList;
import java.util.List;

public class RowTypeClinet {

    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add(new Coin());
        Doge doge = (Doge)list.get(0);  //로타입 사용 시 컴파일 레밸에서 에러를 잡을 수 없음. 그래서 제네릭을 사용해야함.


        List<?> list2 = new ArrayList<>();
        //list2.add(new Doge());

    }

    static class Coin{

    }

    static class Doge{

    }

}
