package ch2.hoon.item5;

public class OnlineItemFactory extends ItemFactory{

    @Override
    public Item create(Item.ItemType itemType) {
        if(Item.ItemType.ONLINE == itemType)
            return new OnlineItem();
        else if(Item.ItemType.EMART == itemType)
            return new EmartItem();

        throw new IllegalArgumentException("잘못된 상품 타입입니다.");
    }

}
