package ch3.dahye.item11;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class item11 {
    public static void main(String[] args) {

        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(new PhoneNumber((short) 707,(short) 867,(short) 5309), "제니");

        PhoneNumber pn = new PhoneNumber((short) 707,(short) 867,(short) 5309);
        System.out.println(pn.toString());
        System.out.println(map.get(pn));

        Product product = Product.builder().price(new BigDecimal(990000)).name("autoValue").build();
        System.out.println(product);
    }
}
