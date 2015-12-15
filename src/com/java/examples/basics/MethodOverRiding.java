package com.java.examples.basics;


class superClass {
	
	 protected void method() throws Error{
		System.out.println("--static method of super class");
		throw new Error("hiiiiiiiiiiiiiiii");
	}
}

class Subclass extends superClass {
	
	 protected void method(){
		System.out.println("--static method of sub class");
	}
}

public class MethodOverRiding {
	public static void main(String args[]){
		superClass superClass = new superClass();
		try {
			
			superClass.method();
		} catch (Throwable e) {
			System.out.println("============"+e.getMessage());
		}
	}

	
}

