package ch8.dahye.item52;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class OverloadingTest {
    @Test
    void overloadingTest() {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        Assertions.assertEquals(CollectionClassifier.classify(collections[0]), "집합");
        Assertions.assertEquals(CollectionClassifier.classify(collections[1]), "리스트");
        Assertions.assertEquals(CollectionClassifier.classify(collections[2]), "그 외");
    }
}
