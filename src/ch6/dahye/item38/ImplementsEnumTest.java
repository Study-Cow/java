package ch6.dahye.item38;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

public class ImplementsEnumTest {

    @Test
    void extendedOperationTest() {
        double x = 4.0;
        double y = 2.0;

        test(ExtendedOperation.class, x, y);
        test2(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

    private static void test2(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
