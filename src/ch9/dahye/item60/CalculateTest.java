package ch9.dahye.item60;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Comparator;

public class CalculateTest {

    @Test
    void floatAndDoubleTest(){
        System.out.println(1.03 - 4.02);
        System.out.println(BigDecimal.valueOf(1.03).subtract(BigDecimal.valueOf(4.02)));
        System.out.println(1.00 - 9 * 0.10);
        System.out.println(BigDecimal.valueOf(1.00).subtract(BigDecimal.valueOf(9).multiply(BigDecimal.valueOf(0.10))));
        Integer a = 10;
        Integer b = 10;
        System.out.println(naturalOrder.compare(a,b));

        System.out.println(naturalOrder.compare(new Integer(42), new Integer(42)));
    }
    Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
      int i = iBoxed;
      int j = jBoxed;
      return (i < j) ? -1 : (i == j ? 0 : 1);
    };



}
