package ch4.hoon.item18;

public class MultifunctionMachine {  //전달 클래스

    private Printer printer; //복합기의 구성요소 (composition)로 printer 사용

    public void print(){ //전달 메서드

        //추가 작업 가능

        printer.print();
    }

}
