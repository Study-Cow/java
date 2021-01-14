package ch2.hoon.item5;

public class OnlineItem extends Item{

    @Override
    public void updateItemChrctId(ItemChrct itemChrct) {
        if(ItemChrct.ALCOHOL == itemChrct)
            throw new IllegalArgumentException("온라인 상품은 주류로 등록할 수 없습니다.");
        this.itemChrct = itemChrct;
    }

}
