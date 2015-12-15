package com.java.examples.errors;

 class SuperError extends Throwable{
	 SuperError(String message){
		 super(message);
	 }
 }

public class MyErrorClass {

	public void method() throws Throwable{
		throw new Error("MyErrorClass");
	}
	public static void main(String[] args) {
		MyErrorClass class1 = new  MyErrorClass();
			try {
				class1.method();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IndexOutOfBoundsException e) { 
			    // catch the exception 
			    System.out.println("No matching element found.");
			}
			catch (Throwable e) {
			    throw e; // rethrow the exception/error that occurred
			}

	}

}
