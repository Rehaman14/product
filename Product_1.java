package product;

import java.util.Scanner;

public class Product_1 
{
	int productId;
	String productName;
	
	public void setProductData() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter product Id :");
		int productId=sc.nextInt();
		 
		System.out.print("Enter product Name :");
		String productName=sc.nextLine();
	    productName=sc.nextLine();
	    sc.close();
	}
	public void  getProductInformation()
	{
		System.out.print(" product Id :"+productId);
	
		System.out.print(" product Name :"+productName);
	}

}
