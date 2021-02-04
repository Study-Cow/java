package test.ch2.sunmin.item10;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class ItemApi {
	
	private String itemId; // itemID를 첫번째로 비교하게 만든다. hashCode로도 만들어볼까?
	
	private Item 	item;
	private Order 	order;
	
	// @equals 메소드 처럼 비교할 때 사용
	public Item asItem() {
		return item;
	}
	
	public Order asOrder() {
		return order;
	}
	
	// 복사생성자
	public ItemApi(ItemApi itemApi) {
		this.itemId = itemApi.itemId;
		this.item 	= new Item(itemApi.item);
		this.order 	= new Order(itemApi.order);
	}
	
}
