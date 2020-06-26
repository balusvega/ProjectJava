package com.examples;

public class FirstProgram{
   /// members
		//    Fields
		//  methods
	// declaration and initialization
	// declare --- you have to this.
	public int myVariable;   // statement
	public int secondVariable = 15;
	public boolean boolVar = true;

	public void myMethod(){
		System.out.println("Inside the my method");
		myVariable = 10;
	}


	public int mySecondMethod(){
		
		System.out.println("my var value before : "+myVariable);	
		System.out.println("Inside the my second method");	
		int methodvar = 25;

		int myVariable =45;
		System.out.println("my var value: "+myVariable);	

		return methodvar;
	}
	
	public boolean myThirdMethod(int inputVar){
		System.out.println("Inside the my second method");	

		return false;

	}

	public void myFourthMethod(int inputVar){
		System.out.println("Inside the my second method"+ inputVar);	

	}

}