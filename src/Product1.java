package src;

import java.util.ArrayList;
import java.util.List;

public class Product1 {
	private String productName;
	private int productId;
	
	//Item1 it = new Item1();
	List<Item1> itemList1 = new ArrayList<Item1>();
	
	
	public List<Item1> getItemList1() {
		return itemList1;
	}
	public void setItemList1(List<Item1> itemList1) {
		this.itemList1 = itemList1;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
}
	


