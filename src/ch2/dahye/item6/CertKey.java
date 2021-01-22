package ch2.dahye.item6;

import java.util.regex.Pattern;

public class CertKey {

    // 현재 제휴에서 인증 키 값 패턴 확인시
    // certkey.matches(certKeyRegex); 와 같이 item6에서 권장하지 않는 방법으로 사용중
    // 배치 수행시 최대 1000개의 상품 * 등록된 인증 수 만큼 Pattern 인스턴스가 생성되고 있을 것으로 보이며, 해당 방법으로 개선하는 것이 좋을 것 같다.
    private static final Pattern CERT_KEY = Pattern.compile("^[A-Za-z0*9-_]*$");

    static Boolean isValidCertKey(String key){
        return CERT_KEY.matcher(key).matches();
    }
}
