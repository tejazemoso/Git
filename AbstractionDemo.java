package com.basicsstrong.oop;

interface Mobile
{
	public void call(int number);
	public void sendMessage(String message);
	
}
class samsung implements Mobile
{

	@Override
	public void call(int number) {
		System.out.println("Calling Number "+number);
		
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending message "+message);
		
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		samsung myphn = new samsung();
		myphn.call(125367847);
		myphn.sendMessage("Hello");

	}

}
