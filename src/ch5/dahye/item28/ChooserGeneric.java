package ch5.dahye.item28;

import java.util.Collection;

public class ChooserGeneric<T> {

    private final T[] choiceArray;


    public ChooserGeneric(Collection<T> choices) {
        this.choiceArray = (T[]) choices.toArray();
    }
}
