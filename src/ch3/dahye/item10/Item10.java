package ch3.dahye.item10;

import ch2.hoon.item6.AutoBoxingExample;

import java.awt.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Item10 {

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Test");
        String s = "test";

        System.out.println(s.equals(cis));
        System.out.println(cis.equals(s));


        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(s));

        Point p = new Point(1,2);
        ColorPoint cp = new ColorPoint(1,2, Color.RED);
        ColorPoint cp2 = new ColorPoint(1,2,Color.BLACK);

        System.out.println(cp.equals(p));
        System.out.println(p.equals(cp2));
        System.out.println(cp2.equals(cp));

    }
}
