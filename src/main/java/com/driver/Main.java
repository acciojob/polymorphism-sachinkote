package com.driver;


public class Main {
    public static  class Product{
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
	
	public static void main(String args[])
	{
		Product p=new Product();
		int res1=p.product(10, 20);
		
		int res2=p.product(10, 20, 20);
		
		
		double res3=p.product(10.0, 20.20);
		System.out.println(res1+" "+res2+" "+res3);
	}
}
