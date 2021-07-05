package ch8.dahye.item49;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Objects;

public class MethodTest {

    /**
     * (현재 값 mod m) 값을 반환
     * 항상 음이 아닌 BigInteger를 반환한다는 점에서 remainder와 다름
     *
     * @param m 계수(양수)
     * @return 현재 값 mod m
     * @throws ArithmeticException m이 0 이하이면 발생
     */
    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0) {
            throw new ArithmeticException("계수(m)는 양수여야 합니다. " + m);
        }
        return m;
    }

    @Test
    void requreNonNullTest() {
        String a = null;

        Assertions.assertThrows(NullPointerException.class, () -> Objects.requireNonNull(a));
    }

    @Test
    void assertTest() {
        long b[] = {0, 1, 3, 5};
        Assertions.assertThrows(AssertionError.class, () -> sort(b,-1, 10));
    }

    private static void sort(long a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
    }

}
