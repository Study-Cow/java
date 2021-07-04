package ch8.hoon.item49;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NullCheckTest {

    public static void main(String[] args) {
        String s = null;
        Objects.requireNonNull(s, "s가 null 입니다.");
    }

}
