package test.ch2.sunmin.item10;

import java.util.ArrayList;
import java.util.List;

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
public class Order {
	private List<String> orderedCustomerList;
	
	public Order(Order order) {
		// deepCopy
		List<String> copylist = new ArrayList<String>();
		copylist.addAll(order.orderedCustomerList);
		this.orderedCustomerList = copylist;
//		this.orderedCustomerList = order.orderedCustomerList;
	}
}
