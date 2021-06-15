package ch6.hoon.item41;

public class TestMain {

    public static void main(String[] args) {
        Class<?> testClass = MarkerClass.class;

        if(testClass.isAnnotationPresent(Marker.class)){
            System.out.println("Marker Annotation");
        }

        //MarkerInteface marker = new MarkerClass();   //컴파일 시 타입 체크

    }

}
