package ch3.hoon.item14;

public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {

    private String s;

    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s); //대소문자 구분 없이 비교
    }

}