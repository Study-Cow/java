package ch2.hoon.item4;

public class Item {
    private Item(){};
}

/**
 * 부모 클래스의 생성자가 private일 경우 호출 상속 불가
 */
//class ChileItem extends Item{
//    public ChileItem(){
//        super();
//    }
//}


class ItemCreateTest {
    public static void main(String[] args) {
        //Item item = new Item();  //인스턴스화 불가
    }
}