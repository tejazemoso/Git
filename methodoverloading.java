package com.basicsstrong.oop;

class Addition
{
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
}
public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add2 = new Addition();
		Addition add3 = new Addition();
		System.out.println("Addition of 2 numbers "+add2.sum(2, 3));
		System.out.println("Addition of 3 numbers "+add3.sum(2,3,7));
	}

}
