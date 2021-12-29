package com.basicsstrong.oop;
interface A{
	default void method() {
		System.out.println("This is interface A");
	}
}
interface B{
	default void method() {
		System.out.println("This is interface B");
	}
}
class C implements A,B{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		B.super.method();
	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c= new C();
		c.method();

	}

}
