package ch2.hoon.item2;

import static ch2.hoon.item2.NyPizza.Size.SMALL;
import static ch2.hoon.item2.Pizza.Topping.ONION;
import static ch2.hoon.item2.Pizza.Topping.SAUSAGE;

public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override public Calzone build() {
            return new Calzone(this);
        }

        @Override protected Builder self() { return this; }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public static void main(String[] args) {
        Calzone pizza = new Calzone.Builder()
                .addTopping(SAUSAGE).addTopping(ONION)
                .build();
    }

}