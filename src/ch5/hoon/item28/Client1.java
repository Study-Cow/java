package ch5.hoon.item28;

import java.util.ArrayList;
import java.util.List;

public class Client1 {

    public static void main(String[] args) {
        Object[] objects = new Long[1];
        objects[0] = "타입이 달라 넣을 수 없다.";     //런타임때 에러 발생

        //List<Object> o1 = new ArrayList<Long>();  //컴파일에 에러 발생

    }

}
