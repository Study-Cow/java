package ch4.hoon.item19;

public class Super {
    public Super() {
        //overrideMe();
        helperMethod();
    }

    public void overrideMe() {
        helperMethod();
    }

    private void helperMethod() {
        System.out.println("super method");
    }
}