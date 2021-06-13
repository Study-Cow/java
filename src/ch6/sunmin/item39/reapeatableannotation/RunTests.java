package ch6.sunmin.item39.reapeatableannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("ch6.sunmin.item39.reapeatableannotation.Sample2"); // 클래스 리터럴
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionTest.class) || m.isAnnotationPresent(ExceptionTestContainer.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    
                    int oldPassed = passed;
                    
//                    Class<? extends Throwable>[] excTypes = m.getAnnotation(ExceptionTest.class).value();
                    
                    //	Returns annotations that are associated with this element.
                    //	If there are no annotations associated with this element, the return value is an array of length 0.
                    //	The difference between this method and getAnnotation(Class)is that this method detects if its argument is a repeatable annotation type (JLS 9.6),
                    //	and if so, attempts to find one or more annotations of that type by "looking through" a container annotation.
                    // 	The caller of this method is free to modify the returned array; it will have no effect on the arrays returned to other callers.
                    ExceptionTest[] excTests = m.getAnnotationsByType(ExceptionTest.class);
                    
                    // 선언한 Exception 중에 하나라도 맞으면 passed 증가
//                    for(Class<? extends Throwable> excType : excTypes) {
//                    	if(excType.isInstance(exc)) {
//                    		passed++;
//                    		break;
//                    	}
//                    }
                   
                    // 그치만 이전 passed 개수와 동일하다면, 맞은 Exception 이 하나도 없던 것이니 fail
                    if(passed == oldPassed) {
                    	System.out.printf("테스트 %s 실패 : 기대한 예외 %s, 발생한 예외 %s%n", m, exc);
                    }                    
                    
                } catch (Exception exc) {
                    System.out.println("잘못 사용한 @Test: " + m);
                }
            }
            
            if (m.isAnnotationPresent(ExceptionTest.class)
                    || m.isAnnotationPresent(ExceptionTestContainer.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
                } catch (Throwable wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    int oldPassed = passed;
                    ExceptionTest[] excTests =
                            m.getAnnotationsByType(ExceptionTest.class);
                    for (ExceptionTest excTest : excTests) {
                        if (excTest.value().isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed)
                        System.out.printf("테스트 %s 실패: %s %n", m, exc);
                }
            }

            System.out.printf("성공: %d, 실패: %d%n", passed, tests - passed);
        }
    }
}
