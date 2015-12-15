package com.java.examples.accessModifiers;

public class SubClassInSamePackage extends SuperClass {

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		superClass.defalutMethod();
		//superClass.privateMethod();
		superClass.protectedmethod();
		superClass.publicMethod();
		System.out.println(superClass.sal);

	}

}
