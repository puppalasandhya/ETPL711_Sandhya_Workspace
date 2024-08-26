package com.evergent.corejava.exceptionhandling;
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message)
	{
		System.out.println("Hello :"+message);
	}
}

public class ProductImpl3 {
	int pno=105;
	public void myData()throws ProductNotFoundException
	{
		if(pno>100)
		{
		throw new ProductNotFoundException("there is no products");
		}
		else
		{
			System.out.println("products are there");
		}
	}

	public static void main(String[] args) {
		try {
			ProductImpl3 product =new ProductImpl3();
			product.myData();
		}
		catch(ProductNotFoundException e)
		{
			System.out.println(e);
		}

	}

}