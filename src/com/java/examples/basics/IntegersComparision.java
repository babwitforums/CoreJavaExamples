package com.java.examples.basics;

//When you compile a number literal in Java and assign it to a Integer (capital I) the compile emits:
//Integer b2 =Integer.valueOf(127)
//This line of code is also generated when you use autoboxing.
//valueOf is implemented such that certain numbers are "pooled", and it returns the same instance for values smaller than 128.

public class IntegersComparision {

	public static void main(String[] args) {
Integer i1 = 128;
Integer i2 = 128;
System.out.println(i1==i2);
Integer i3 = 127;
Integer i4 = 127;
System.out.println(i3==i4);
	}

}

