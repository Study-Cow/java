package ch6.dahye.item36;

/**
 * 정수 열거 패턴
 * 비트 필드 열거 상수 - 이전 기법
 */
public class Text {
    public static final int STYLE_BOLD          = 1 << 0;
    public static final int STYLE_ITALIC        = 1 << 1;
    public static final int STYLE_UNDERLINE     = 1 << 0;
    public static final int STYLE_STRIKETHROUGH = 1 << 0;

    // 매개변수 syltes는 0개 이상의 STYLE_ 상수를 비트별 OR한 값
    public void applyStyles(int styles) {  }

}
