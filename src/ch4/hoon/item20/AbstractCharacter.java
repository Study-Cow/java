package ch4.hoon.item20;

public abstract class AbstractCharacter implements Character{

    @Override
    public void move() {
        System.out.println("걷다");
    }

    @Override
    public void seat() {
        System.out.println("앉다");
    }

    @Override
    public void process() {
        move();
        seat();
        attack();
    }

}
