package ch7.hoon.item48;

import java.math.BigInteger;
import java.util.stream.Stream;

public class StreamPallelExample {

    public static void main(String[] args) {
        //20개의 메르센 소수 생성
        primes().map(p -> (BigInteger.TWO).pow(p.intValueExact()).subtract(BigInteger.ONE))
                //.parallel()
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);
    }

    static Stream<BigInteger> primes() {
        return Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
    }

}
