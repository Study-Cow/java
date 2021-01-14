package ch2.hoon.item5;

public class EmartItem extends Item{

    //이마트 상품에서만 사용하는 속성
    private String pickupYn;

    @Override
    public void updateItemChrctId(ItemChrct itemChrct) {
        if(ItemChrct.ALCOHOL == itemChrct && !"Y".equals(pickupYn))
            throw new IllegalArgumentException("점포픽업 상품의 경우만 주류 상품으로 등록할 수 있습니다.");
        this.itemChrct = itemChrct;
    }

}
