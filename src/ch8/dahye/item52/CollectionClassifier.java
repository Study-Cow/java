package ch8.dahye.item52;

import java.util.*;

public class CollectionClassifier {

    public static String classify(Collection<?> c) {
        return c instanceof Set ? "집합" :
                c instanceof List ? "리스트" : "그 외";
    }

}
