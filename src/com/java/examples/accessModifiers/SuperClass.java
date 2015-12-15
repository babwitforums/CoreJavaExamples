package com.java.examples.accessModifiers;

public class SuperClass {
	protected int sal = 300;
	
	void defalutMethod(){
		System.out.println("default Method");
	}
	
	private void privateMethod(){
		System.out.println("private method");
	}
	protected void protectedmethod(){
		System.out.println("protected method");
	}
	public void publicMethod(){
		System.out.println("public method");
	}
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		superClass.defalutMethod();
		superClass.privateMethod();
		superClass.protectedmethod();
		superClass.publicMethod();
		System.out.println(superClass.sal);
	}

}
