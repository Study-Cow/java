package ch6.hoon.item36;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class EnumSetText {

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    // 어떤 Set을 넘겨도 되나, EnumSet이 가장 좋다.
    public void applyStyles(Set<Style> styles) {
        System.out.printf("Applying styles %s to text%n", Objects.requireNonNull(styles));
    }

    // 사용 예시
    public static void main(String[] args) {
        EnumSetText enumSetText = new EnumSetText();
        enumSetText.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }

}