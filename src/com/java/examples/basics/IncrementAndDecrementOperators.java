package com.java.examples.basics;

public class IncrementAndDecrementOperators {
		static int a = 1;
	 static {
		 a = a++ + a++;
		 System.out.println("static block "+a);

	 }
	 {
		 a = a++ + ++a;
		 System.out.println("non static block "+a);

	 }
	public static void main(String[] args) {
		//System.out.println("final output  before creating object"+IncrementAndDecrementOperators.a);
		//IncrementAndDecrementOperators obj= new IncrementAndDecrementOperators();
		//System.out.println("final output  after creating object"+a);

	}

}
