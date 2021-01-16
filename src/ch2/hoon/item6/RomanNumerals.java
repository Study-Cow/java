package ch2.hoon.item6;

import java.util.regex.Pattern;

public class RomanNumerals {

    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }

    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    public static void main(String[] args) {

        //1. String.matches 사용
        long beforeTime1 = System.nanoTime();
        RomanNumerals.isRomanNumeralSlow("III");
        long afterTime1 = System.nanoTime();
        long secDiffTime1 = (afterTime1 - beforeTime1);
        System.out.println("걸린시간1 : "+secDiffTime1);

       //2. RomanNumerals Pattern 객체 재사용
        long beforeTime2 = System.nanoTime();
        RomanNumerals.isRomanNumeralFast("III");
        long afterTime2 = System.nanoTime();
        long secDiffTime2 = (afterTime2 - beforeTime2);
        System.out.println("걸린시간2 : "+secDiffTime2);

    }

}
