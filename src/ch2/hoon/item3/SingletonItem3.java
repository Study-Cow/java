package ch2.hoon.item3;

/*
 * 3. 열거타입(enum) 방식을 이용한 싱글턴 구현
 */
public enum SingletonItem3 {
    INSTANCE("구훈", 28);

    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    private SingletonItem3(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class SingletonItem3Main {
    public static void main(String[] args) {
        System.out.println(SingletonItem3.INSTANCE.getAge());
        System.out.println(SingletonItem3.INSTANCE.getName());
    }
}