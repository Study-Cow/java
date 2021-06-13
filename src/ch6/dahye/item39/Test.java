package ch6.dahye.item39;

import java.lang.annotation.*;

/**
 * 테스트 메서드임을 선언
 * 매개변수 없는 정적 메서드 전용
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
