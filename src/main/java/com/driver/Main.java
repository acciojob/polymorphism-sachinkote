package com.driver;

class product{
	public int product(int x, int y) {
		return x*y;
	}
	public int product(int x, int y, int z) {
		return x*y*z;
	}
	public double product(double x, double y) {
		return x*y;
	}
}
public class Main {

	
	public static void main(String args[])
	{
		product p=new product();
		int res1=p.product(10, 20);
		System.out.println("res1: "+res1);
		int res2=p.product(10, 20, 20);
		System.out.println("res2: "+res2);
		
		double res3=p.product(10.0, 20.20);
		System.out.println("res3: "+res3);
	}
}