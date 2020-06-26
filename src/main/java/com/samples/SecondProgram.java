package com.samples;

import com.examples.FirstProgram;

public class SecondProgram{

	public static void main(String[] args) {
	// decalre it the variable
		FirstProgram aFirstProgram  =  new FirstProgram();
		/// variable of class is reference var

		int intVar = aFirstProgram.myVariable;
		System.out.println("the value of intVar "+intVar);
		boolean boolVar = aFirstProgram.boolVar;

		int secondInt = aFirstProgram.mySecondMethod();
		System.out.println("the value of intVar "+secondInt);
		
	}
}

