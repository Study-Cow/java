package test.ch2.sunmin.item10;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@ToString
public class Item {
	
	private String itemId;
	private String itemNm;
	private int invQty;
	private double sellprc;
	
	public Item(Item item) {
		this.itemId = item.itemId;
		this.itemNm = item.itemNm;
		this.invQty = item.invQty;
		this.sellprc = item.sellprc;
	}

}
