package ch6.dahye.item34;

public class EnumTest {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("185");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.printf("%s에서의 무게는 %f이다.%n", p, p.surfaceWeight(mass) );
        }

        Operation i = Operation.valueOf("PLUS");
        System.out.println(i);
    }
}
