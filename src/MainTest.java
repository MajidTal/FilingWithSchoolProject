package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		ArrayList<Shop1> shopList = new ArrayList<Shop1>();
	    HashSet<String> prodHash = new HashSet<String>();

		Scanner sc = new Scanner(System.in);

		boolean condition1 = true;
		boolean condition2 = true;
		boolean condition3 = true;

		while (condition1) {
			System.out.println("To join the page press 1");
			System.out.println("To print the result press 2");
			System.out.println("To get history press 3");
			System.out.println("To exit the page press 4");
			System.out.println("To remove duplicate press 5");

			int input = sc.nextInt();

			if (input == 1) {
				Shop1 sh = new Shop1();
				System.out.println("Please enter the shop1 name");
				String a = sc.next();
				sh.setShopName(a);

				System.out.println("Please enter the shop location");
				String b = sc.next();
				sh.setShopLocation(b);

				condition2 = true;
				while (condition2) {
					Product1 pr = new Product1();
					System.out.println("Please enter product name");
					String aa = sc.next();
					pr.setProductName(aa);
					prodHash.add(aa);
					
					System.out.println("Please enter product ID ");
					int bb = sc.nextInt();
					pr.setProductId(input);

					condition3 = true;
					while (condition3) {
						Item1 it = new Item1();
						System.out.println("Please enter the item name");
						String aaa = sc.next();
						it.setItemName(aaa);

						System.out.println("Please enter the item price");
						int bbb = sc.nextInt();
						it.setItemPrice(bbb);

						pr.itemList1  .add(it);
						System.out.println("Do you want to add other item?");
						String i = sc.next();
						if (i.equals("yes"))
							System.out.println("print the new item");
						else if (i.equals("no")) {
							condition3 = false;
						}
					}

					sh.productList.add(pr);
					System.out.println("Do you want to add other product");
					String p = sc.next();
					if (p.equals("yes")) {
						System.out.println("print the new product");
					} else if (p.equals("no")) {
						condition2 = false;
					}
				}
					shopList.add(sh);
					System.out.println("Do you want to add other shop");
					String s = sc.next();
					if (s.equals("yes")) {
						System.out.println("print the shop");
					} else if (s.equals("no")) {
						condition2 = false;
					}
				}

			

			else if (input == 2) {
				System.out.println("print the result");
				
				for(Shop1 x :shopList )
				{
					System.out.println("----------<shop details>---------");
					System.out.println("the shop name is " + x.getShopName());
					System.out.println("the shop location is " + x.getShopLocation());
					
					for(Product1 xx : x.productList)
					{
						System.out.println("--------<product details>--------");
						for (String hashpName : prodHash) {
						System.out.println("the product name is " + hashpName);
						}
						System.out.println("the product id is "+ xx.getProductId());						
						
						
						for(Item1 xxx : xx.itemList1)
						{
							System.out.println("--------<item details>--------");
							System.out.println("the name of item is " + xxx.getItemName());
							System.out.println("the item price is " + xxx.getItemPrice());
						}
					
						
					}

					
				}
				

				
				
				
			}

			else if (input == 3) {
				System.out.println("to get the hiatory");
			}

			else if (input == 4) {
				System.out.println("goodbye1");
				condition1 = false;

			}

			


	}

}}
