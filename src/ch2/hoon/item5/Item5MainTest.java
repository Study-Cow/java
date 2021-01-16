package ch2.hoon.item5;

public class Item5MainTest {

    public static void main(String[] args) {
        ItemFactory itemFactory = new OnlineItemFactory();
        Item item = itemFactory.create(Item.ItemType.ONLINE);
        item.updateItemChrctId(Item.ItemChrct.ALCOHOL);

        ItemService itemService = new ItemService();
        itemService.saveItem(item); //사용하는 쪽에서는 온라인 상품인지 모름
    }

}
