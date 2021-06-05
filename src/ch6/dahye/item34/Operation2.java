package ch6.dahye.item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operation2 {
    PLUS("+")    {public double apply(double x, double y){return x + y;}},
    MINUS("-")   {public double apply(double x, double y){return x - y;}},
    TIMES("*")   {public double apply(double x, double y){return x * y;}},
    DIVIDE("/")  {public double apply(double x, double y){return x / y;}};

    private final String symbol;

    Operation2(String symbol) {
        this.symbol = symbol;
    }
    @Override public String toString() {
        return symbol;
    }
    public abstract double apply(double x, double y);

    private static final Map<String, Operation2> stringToEnum = Stream.of(values()).collect(Collectors.toMap(Object::toString, e->e));

    public static Optional<Operation2> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
