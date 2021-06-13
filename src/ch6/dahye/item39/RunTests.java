package ch6.dahye.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RunTests {
    public static void main(String[] args) throws ClassNotFoundException {
        int cnt = 0;
        int passed = 0;

        Class<?> testClass = Class.forName("ch6.dahye.item39.AnnotationSample");

        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                cnt++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    System.out.println(m + " 실패: " + exc);
                } catch (Exception e) {
                    System.out.println("잘못 사용한 예 " + m);
                }
            } else if (m.isAnnotationPresent(ExceptionTest.class) || m.isAnnotationPresent(ExceptionTestContainer.class)) {
                cnt++;
                try {
                    m.invoke(null);
                    System.out.printf("test %s fail: 예외를 던지지 않음%n", m);
                }catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    int oldPassed = passed;
                    ExceptionTest[] excTypes = m.getAnnotationsByType(ExceptionTest.class);
                    for (ExceptionTest excType : excTypes) {
                        if (excType.value().isInstance(exc)) {
                            passed++;
                            break;
                        } else {
                            System.out.printf("test %s fail: 기대한 예외 %s, 발생한 예외 %s%n", m, excType.value().getName(), exc);
                        }
                    }
                    if (passed == oldPassed) {
                        System.out.printf("테스트 %s 실패 : %s %n", m, exc);
                    }
                } catch (Exception e) {
                    System.out.println("잘못 사용한 예 " + m);
                }
            }
        }
        System.out.printf("성공 : %d, 실패: %d%n", passed, cnt - passed);
    }
}
