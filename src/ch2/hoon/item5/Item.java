package ch2.hoon.item5;

public abstract class Item {

    public enum ItemType{ONLINE, EMART}
    public enum ItemChrct{BOOK, ALCOHOL}

    //공통으로 사용하는 속성
    protected String itemId;
    protected String itemNm;
    protected ItemChrct itemChrct;

    public abstract void updateItemChrctId(ItemChrct itemChrct);


}
