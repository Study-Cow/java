package ch3.dahye.item11;

import com.google.auto.value.AutoValue;

import java.math.BigDecimal;

@AutoValue
public abstract class Product {
    public abstract String name();
    public abstract BigDecimal price();

    @AutoValue.Builder
    public abstract static class Builder{
        public abstract Builder name(String name);
        public abstract Builder price(BigDecimal price);
        public abstract Product build();
    }

    public static Product.Builder builder(){
        return new AutoValue_Product.Builder();
    }
}