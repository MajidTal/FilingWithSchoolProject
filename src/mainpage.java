package src;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class mainpage {

	public static void main(String[] args) {

		ArrayList<Shop1> shopeList = new ArrayList<Shop1>();
		Shop1 sh = new Shop1();
		Scanner sc = new Scanner(System.in);
        Stack<String>HistoryList= new Stack();


		boolean cond1 = true;
		boolean cond2 = true;
		boolean cond3 = true;
		while (cond1) {
			System.out.println("Enter the shop name:");
			String n=sc.next();
			sh.setShopName(n);
			HistoryList.push(n);
			
			
			System.out.println("Enter the location of shope:");
			String nn = sc.next();
			sh.setShopLocation(n);
			HistoryList.push(nn);
			
			shopeList.add(sh);

			 cond2 = true;
			while (cond2) {
				Product1 pr = new Product1();
				System.out.println("Enter the proudct name:");
				String nnn = sc.next();
				pr.setProductName(nnn);
				HistoryList.push(nnn);
				
				System.out.println("Enter the id of product:");
				int nnnn =sc.nextInt();
				pr.setProductId(nnnn);
				String Idpro = Integer.toString(nnnn);
				HistoryList.push(Idpro);
				
					sh.productList.add(pr);
				
				 cond3 = true;
				while (cond3) {
					Item1 it = new Item1();

					System.out.println("Enter the item name:");
					String Itname =sc.next();
					it.setItemName(Itname);
				
				
					System.out.println("Enter the item price:");
					int Itprice =sc.nextInt();
					it.setItemPrice(Itprice);
				    String cccc =Integer.toString(Itprice);
				    HistoryList.push(cccc);
				    
				  pr.itemList1.add(it);
                      
					System.out.println("Do you want to add a new item?");
					String a = sc.next();
					if (a.equals("yes")) 
					{
						cond3 = true;
					}
					else if (a.equals("no"))
					{
						cond3 = false;
					}
				
				}
			

			System.out.println("Do you want to add a new product?");
			String b = sc.next();

			if (b.equals("no")) {

				cond2 = false;
			}
			
		}
			
		System.out.println("Do you want to add a new shop?");
		String cc = sc.next();

		
		
		
		if (cc.equals("no")) {
			cond1 = false;
			for (Shop1 element22 : shopeList ) {
				System.out.println("---------------shope details-------------");
				System.out.println("The shope name is: " + element22.getShopName());
				System.out.println("The location of product is: " + element22.getShopLocation());

			

			for (Product1 element11 : element22.productList) {
				System.out.println("---------------product details-------------");
				System.out.println("The product name is: " + element11.getProductName());
				System.out.println("The product id is: " + element11.getProductId());

		for (Item1 element111 : element11.itemList1)
		{
			System.out.println("---------------items details-------------");
			System.out.println("The item name is:" + element111.getItemName());
			System.out.println("The item price is:" + element111.getItemPrice());

		}

				System.out.println("the hisotry");
				for(String s:HistoryList )
				{
					System.out.println(s);
				}
				
			}
			}
		}
		
	
		

		
		}
            
		sc.close();
	}

}
