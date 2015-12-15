package com.java.examples.basics;

public class RetrunNullToIntDataType {

	public int getValue() {
		return (true?null:0);
	}
	public static void main(String[] args) {
		RetrunNullToIntDataType obj = new RetrunNullToIntDataType();
	    System.out.println(obj.getValue());
	}

}
