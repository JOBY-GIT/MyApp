package com.ofss;

public class TestProduct {

	public static void main(String[] args) {
		Product p=new Product("SmartPhone",45000);
		System.out.println(p.getProductName()+" and "+p.getProductPrice());
		System.out.println("Push1");
		System.out.println("Push2");
	}

}
