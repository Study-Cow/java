package ch2.dahye.item6;

import java.math.BigDecimal;

public class CommChnlPromHelper {

    // 현재 제휴 상품 연동시 프로모션이 적용된 값을 구할 때 auto boxing의 문제점을 그대로 사용하고 있다.
    // 흔히 가격을 계산할 때 BigDecimal 객체를 사용하는데, BigDecimal 내부를 보면 기본타입으로 생성자와 메서드가 이루어져있는 것을 볼 수 있다.
    // BigDecimal의 longValue()는 return type이 long이나 dcAmt는 Long 타입으로 선언되어 있다.
    // 각 프로모션(1차, 2차, 기타) 계산시마다 새로운 인스턴스가 생성이 되므로 이 부분은 추후에 개선할 예정이다.

    public BigDecimal getPromPrc(long testPrc){
        long realDcPrc = 0L;
        BigDecimal firstDcAmt  = new BigDecimal(testPrc);

        realDcPrc += firstDcAmt.longValue();

        return new BigDecimal(realDcPrc);
    }

}
