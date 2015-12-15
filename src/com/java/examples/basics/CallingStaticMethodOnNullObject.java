package com.java.examples.basics;

public class CallingStaticMethodOnNullObject {

	public static void show(){
		System.out.println("hiii");
	}
	
	public static void main(String[] args) {
		CallingStaticMethodOnNullObject obj = null;
		obj.show();
				
	}

}
