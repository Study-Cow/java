package ch3.dahye.item14;

import ch3.dahye.item11.PhoneNumber;
import ch3.dahye.item11.Product;

import java.math.BigDecimal;
import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("1.00");

        Set<BigDecimal> hs = new HashSet<BigDecimal>();
        hs.add(a);
        hs.add(b);

        System.out.println(hs.size());

        Set<BigDecimal> ts = new TreeSet<>();
        ts.add(a);
        ts.add(b);

        System.out.println(ts.size());

    }

}
