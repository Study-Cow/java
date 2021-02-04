package ch3.dahye.item11;

import java.util.Comparator;

public final class PhoneNumber implements Cloneable{
    private final short areaCode, prefix, lineNum;
    private int hashCode;

    public PhoneNumber(short areaCode, short prefix, short lineNum){
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix = rangeCheck(prefix, 999,"프리픽스");
        this.lineNum = rangeCheck(lineNum, 9999, "가입자번호");
    }
    private static short rangeCheck(int val, int max, String arg){
        if(val < 0 || val > max){
            throw new IllegalArgumentException(arg+" : "+val);
        }
        return  (short) val;
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof PhoneNumber)){
            return false;
        }

        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode(){
        // int 변수 result 초기화 후 해당 필드의 해시코드 계산
        // 기본타입 필드라면 Type.hashCode() 여기서는 Short.hashCode();
        int result = hashCode;
        if(result == 0){
            result = Short.hashCode(areaCode);
            // 앞에서 계산한 해시코드로 result 갱신
            // 여기서 31은 홀수이면서 소수이기 때문에 사용
            // 짝수는 2를 곱하면 시프트 연산과 같은 결과를 발생시켜 오버플로가 발생하면 정보를 잃게 됨.
            result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
            hashCode = result;
        }

        // result 반환
        return result;
    }

    /**
     * XXX-YYY-ZZZZ 형태로 전화호의 문자열을 반환.
     * XXX : 지역코드
     * YYY : 프리픽스
     * ZZZZ : 가입자 번호
     * @return
     */
    @Override
    public String toString(){
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
    }

    @Override
    public PhoneNumber clone(){
        try{
            return (PhoneNumber) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public int compareTo(PhoneNumber pn){
        int result = Short.compare(areaCode, pn.areaCode);
        if(result == 0){
            result = Short.compare(prefix, pn.prefix);
            if(result == 0){
                result = Short.compare(lineNum, pn.lineNum);
            }
        }
        return result;
    }

    private static final Comparator<PhoneNumber> COMPARATOR = Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode).thenComparingInt(pn -> pn.lineNum).thenComparingInt(pn -> pn.prefix);

    public int compareTo(PhoneNumber pn){
        return COMPARATOR.compare(this, pn);
    }
}
