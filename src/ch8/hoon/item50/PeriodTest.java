package ch8.hoon.item50;

import java.util.Date;

public class PeriodTest {

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        System.out.println(period.start());
        start.setTime(10);
        System.out.println(period.start());
    }

}
