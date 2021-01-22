package ch2.dahye.item7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GcTest {
    // intellj의 Edit Configurations -> VM options에 -verbose:gc -XX:+PrintCommandLineFlags를 추가해주면 GC 컬렉션이 수행되는것을 볼 수 있다.

    public static void main(String[] args) throws InterruptedException {
        List<Integer> li = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        for (int i=1; true; i++) {
            if (i % 100 == 0) {
                li = new ArrayList<>();
                Thread.sleep(10);
            }
            IntStream.range(0, 100).forEach(li::add);
        }
    }
}
