package src;

import java.util.ArrayList;

public class Shop1 {
private String shopName;
private String shopLocation;


//Product1 pr = new Product1();
ArrayList<Product1> productList =new ArrayList<Product1>();


public ArrayList<Product1> getProductList() {
	return productList;
}
public void setProductList(ArrayList<Product1> productList) {
	this.productList = productList;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public String getShopLocation() {
	return shopLocation;
}
public void setShopLocation(String shopLocation) {
	this.shopLocation = shopLocation;
}

}
