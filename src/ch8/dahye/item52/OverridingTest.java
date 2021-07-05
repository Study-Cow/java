package ch8.dahye.item52;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OverridingTest {

    @Test
    void overridingTest() {
        List<Wine> wineList = List.of(new Wine(), new SparlklingWine(), new Champane());

        Assertions.assertEquals(wineList.get(0).name(), "포도주");
        Assertions.assertEquals(wineList.get(1).name(), "발포성 포도주");
        Assertions.assertEquals(wineList.get(2).name(), "샴페인");
    }
}
