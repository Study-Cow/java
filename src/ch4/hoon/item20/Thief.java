package ch4.hoon.item20;

public class Thief extends AbstractCharacter implements Character{
    @Override
    public void attack() {
        System.out.println("표창을 던진다");
    }
}
