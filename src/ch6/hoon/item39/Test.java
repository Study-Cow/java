package ch6.hoon.item39;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 테스트 메서드임을 선언하는 애너테이션이다.
 * 매개변수 없는 정적 메서드 전용이다.
 */
@Retention(RetentionPolicy.RUNTIME) // @Test가 런타임에도 유지되어야 한다는 표시이다.
@Target(ElementType.METHOD) // @Test가 반드시 메서드 선언에서만 사용돼야 한다.
public @interface Test {

}