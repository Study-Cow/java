package ch5.hoon.item30;

import java.util.HashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

public class GenericSingleton {

    private static UnaryOperator<Object> IDENTITY_FN = t -> t;

    public static void main(String[] args) {

        String[] strings = {"삼베", "대마", "나일론"};
        UnaryOperator<String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for(Number n : numbers){
            System.out.println(sameNumber.apply(n));
        }

    }

    /**
     * 항등함수란 입력 값을 수정 없이 그대로 반환하는 특별한 함수이므로, T가 어떤 타입이든 UnaryOperator<T>를 사용해도 타입 안전
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    private static <T> UnaryOperator<T> identityFunction() {   //타입 매개변수 목록은 메서드의 제한자와 반환 타입 사이에 온다.???
        return (UnaryOperator<T>)IDENTITY_FN;
    }

}
