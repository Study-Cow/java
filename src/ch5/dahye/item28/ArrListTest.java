package ch5.dahye.item28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrListTest {

    @Test
    void test() {
        Object[] objects = new Long[1];

        Assertions.assertThrows(ArrayStoreException.class, () -> objects[0] = "ArrayStoreException : 타입이다름");
//        compile error
//        List<Object> ol = new ArrayList<Long>();
//        ol.add("타입이 다름");

        ArrayList<String> stringList = new ArrayList<String>();


        Chooser<?> chooser = new Chooser<>(stringList);



    }



}
