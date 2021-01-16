package ch2.hoon.item1;

public class ItemServiceFactory {

    //메소드명 getType 적용
    static ItemService getItemService(String itemType){    //장점3,4,5 적용
        if("ONLINE".equals(itemType)){
            return new OnlineService();
        } else if("DPTS".equals(itemType)){
            return new DptsService();
        }

        throw new IllegalArgumentException("잘못된 타입 입니다.");
    }

}
