package com.examples;

import com.exceptions.NotAValidDivider;
import com.exceptions.NotAValidMonthException;

public class Calculator{
 
	public int add(int firstNumber, int secondNumber){
		int result = firstNumber + secondNumber;
		return result;
	}

	//overloading a method
	public float add(float firstNumber, float secondNumber){
		float result = firstNumber+secondNumber;
		return result;
	}

	public int substract(int firstNumber, int secondNumber){
		int result = firstNumber - secondNumber;
		return result;
	}

	//overloading a method
	public float substract(float firstNumber, int secondNumber){
		float result = firstNumber - secondNumber;
		return result;
	}

	public int multiply(int firstNumber, int secondNumber){
		int result = firstNumber * secondNumber;
		return result;
	}

	//overloading a method
	public double multiply(int firstNumber, double secondNumber){
		double result = firstNumber * secondNumber;
		return result;
	}

	public int divide(int firstNumber, int secondNumber) throws NotAValidDivider {
		if(secondNumber <= 0)
			throw new NotAValidDivider();
		else {
			int result = firstNumber / secondNumber;
			return result;
		}
	}	

	//overloading a method
	public float divide(float firstNumber, float secondNumber) throws NotAValidDivider {
		if (secondNumber <= 0)
			throw new NotAValidDivider();
		else {
			float result = firstNumber / secondNumber;
			return result;
		}
	}

}