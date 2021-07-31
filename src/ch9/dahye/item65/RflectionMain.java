package ch9.dahye.item65;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

public class RflectionMain {
    public static void main(String[] args) {
        // 클래스명 Class 객체로 변환
        Class<? extends Set<String>> cl = null;
        try {
            cl = (Class<? extends Set<String>>) Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 생성자
        Constructor<? extends Set<String>> cons = null;
        try {
            cons = cl.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // 집합의 인스턴스를 만든다.
        Set<String> s = null;
        try {
            s = cons.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        s.addAll(Arrays.asList(args).subList(1, args.length));


    }

    private static void fatalError(String msg) {
        System.err.println(msg);
        System.exit(1);
    }
}
