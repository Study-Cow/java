package ch4.hoon.item20;

public class Wizard extends AbstractCharacter implements Character{
    @Override
    public void attack() {
        System.out.println("마법봉을 휘두르다");
    }
}