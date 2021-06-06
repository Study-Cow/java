package ch6.hoon.item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Operation {

    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;
    private static final Map<String, Operation> stringToEnum = Stream.of(Operation.values())
                    .collect(Collectors.toMap(Operation::toString, operation -> operation));

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    //Optional로 반환하여 값이 존재하지않을 상황을 클라이언트에게 알린다.
    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public abstract double apply(double x, double y);

    public static void main(String[] args) {
        Optional<Operation> operation = Operation.fromString("+");
        if(operation.isPresent()){
            Operation operation1 = operation.get();
            System.out.println(operation1);
        }
    }

}
