package ch3.hoon.item11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneNumer {

    int n1;
    int n2;
    int n3;

    public PhoneNumer(int n1, int n2, int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumer)) return false;
        PhoneNumer that = (PhoneNumer) o;
        return n1 == that.n1 &&
                n2 == that.n2 &&
                n3 == that.n3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n1, n2, n3);
    }

    public static void main(String[] args) {
        Map<PhoneNumer, String> m = new HashMap<>();
        m.put(new PhoneNumer(707,867,5309), "제니");
        System.out.println(m.get(new PhoneNumer(707,867,5309)));    //hashCode를 재정의 하지 않으면 null 반환
    }


}
