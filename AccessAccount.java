package com.basicsstrong.oop;
class bankaccount
{
	private double balance=10000;
	private String username="teja";
	private String password="abc";
	public void getBalance(String username,String password)
	{
		if(this.username.equals(username) && this.password.equals(password))
			System.out.println("Your balance is "+ balance);
		else
			System.out.println("Invalid username and password");
	}
}
public class AccessAccount
{
	public static void main(String args[])
	{ 
		bankaccount acc= new bankaccount();
		acc.getBalance("teja","abc");
		acc.getBalance("Teja","xyz");
	}
}