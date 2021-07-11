package ch8.sunmin.item55;

import java.util.Optional;

public class ReturnOptional {
    public static void main(String[] args) {
        Optional<String> optionalTest = Optional.ofNullable(null);
        System.out.println(optionalTest.orElseGet(() -> "Null 입니다")); 
    }
}
