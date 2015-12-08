package com.java.examples.whatisoutput;

public class RecursiveObjectCreation {
	
	RecursiveObjectCreation obj = new RecursiveObjectCreation();

	int show(){
		return(true?null:0);
	}
	public static void main(String[] args) {
		
		RecursiveObjectCreation obj = new RecursiveObjectCreation();
		System.out.println(obj.show());
	}

}

//Reason: Whenever object is creating for any class, 
//first JVM allocates memory to all non static variables. 
//Here it leads to recursive object creation and finally it lead to  java.lang.StackOverFlowError