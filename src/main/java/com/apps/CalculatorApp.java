package com.apps;

import com.examples.Calculator;
import com.exceptions.NotAValidDivider;

public class CalculatorApp{

	public static void main(String[] args) throws NotAValidDivider {
	
		 Calculator aCalculator  =  new Calculator();
		 int firstNumber = 100;
		 int secondNumber = 0;

		 int result = aCalculator.add(firstNumber, secondNumber);
		 System.out.println("Addition of "+ firstNumber + " and " + secondNumber + " is " + result);

		 result = aCalculator.substract(firstNumber, secondNumber);
		 System.out.println("Substraction of "+ firstNumber + " and " + secondNumber + " is " + result);

		 result = aCalculator.multiply(firstNumber, secondNumber);
		 System.out.println("Multiplication of "+ firstNumber + " and " + secondNumber + " is " + result);

		 try{
			 result = aCalculator.divide(firstNumber, secondNumber);
			 System.out.println("Division of "+ firstNumber + " and " + secondNumber + " is " + result);
		 } catch (NotAValidDivider exp) {
			 System.out.println("Please enter a valid divider value");
		 }
		 float firstNum = 1.1f;
		 float secondNum = 0.0f;
		 // >> If same variable name is used then - Error that the variable is already defined in method main

		 //calling overloaded methods
		 float resultOverload = aCalculator.add(firstNum, secondNum);
		 System.out.println("Overloaded method Addition of "+ firstNum + " and " + secondNum + " is " + resultOverload);

		 try{
		 resultOverload = aCalculator.divide(firstNum, secondNum);
		 System.out.println("Overloaded method Division of "+ firstNum + " and " + secondNum + " is " + resultOverload);
		 } catch (NotAValidDivider exp) {
		 System.out.println("Please enter a valid divider value");
		 }

		 int secondNm = 2;
		 resultOverload = aCalculator.substract(firstNum, secondNm);
		 System.out.println("Overloaded method Subtraction of "+ firstNum + " and " + secondNm + " is " + resultOverload);

		 int firstNo = 5;
		 double secondNo = 2.5;
		 double resultMultiplied = aCalculator.multiply(firstNo, secondNo);
		 System.out.println("Overloaded method Multiplication of "+ firstNo + " and " + secondNo + " is " + resultMultiplied);
	}
}

















