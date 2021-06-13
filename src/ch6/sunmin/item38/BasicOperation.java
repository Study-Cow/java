package ch6.sunmin.item38;

public enum BasicOperation implements Operation{
	
	/**
	 * 인터페이스를 확장한 Enum Type으로서, 기존 상수에 메서드를 구현하는 방법을 대체했다.
	 */
	
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override public String toString() {
        return symbol;
    }	

}
