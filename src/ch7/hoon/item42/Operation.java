package ch7.hoon.item42;

import java.util.function.DoubleBinaryOperator;

public enum Operation {

    PLUS("+", (x, y) -> x+y),
    MINUS("-", (x, y) -> x-y),
    TIMES("*", (x, y) -> x*y),
    DIVDE("/", (x, y) -> x/y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y){
        return op.applyAsDouble(x, y);
    }

    public static void main(String[] args) {
        double apply = Operation.PLUS.apply(1, 50);
        System.out.println(apply);
    }

}
