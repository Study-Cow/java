package test.ch2.sunmin.item10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemApiClient {
	public static void main(String[] args) {

		ItemApi item_A = new ItemApi();
		item_A.setItemId("1000000234567");
		item_A.setItem(Item.builder().itemId("1000000234567")
									 .itemNm("똠양꿍")
									 .invQty(100)
									 .sellprc(5000)
									 .build());
		
		List<String> customerList = new ArrayList<>();
		customerList.add("선민");
		customerList.add("구훈");
		customerList.add("다혜");
		item_A.setOrder(Order.builder().orderedCustomerList(customerList).build());

		System.out.println("=============");
		System.out.println("첫번째");
		System.out.println("=============");
		
		System.out.println(item_A.toString());
		
		System.out.println("=============");
		System.out.println("복사본 생성 후 수정");
		System.out.println("=============");
		
		ItemApi item_B = new ItemApi(item_A);
		
//		item_B.getItem().setItemNm("나시고렝");
//		item_B.getOrder().getOrderedCustomerList().remove(0);
		
		System.out.println(item_A.toString());
		System.out.println(item_B.toString());
		
		System.out.println(item_B.equals(item_A));
		System.out.println(item_B.asItem().equals(item_A));
		System.out.println(item_B.asItem().equals(item_A.asItem()));
		
		
	}
}
