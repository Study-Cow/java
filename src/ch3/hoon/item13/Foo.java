package ch3.hoon.item13;

/*
 * 가변 상태를 참조하지 않는 클래스용 clone 메서드
 */
public class Foo implements Cloneable{

    private int foo;

    public Foo(int foo){
        this.foo = foo;
    }

    public int getFoo() {
        return foo;
    }

    public void setFoo(int foo){
        this.foo = foo;
    }

    @Override
    protected Foo clone() throws AssertionError {
        try {
            return (Foo)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Foo f1 = new Foo(10);
        Foo f2 = f1.clone();
    }

}
