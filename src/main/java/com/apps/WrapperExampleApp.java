package com.apps;

import com.examples.WrapperExample;
public class WrapperExampleApp{

	public static void main(String[] args) {

		WrapperExample anExample = new WrapperExample();

		// Compares two Integer objects numerically.
		Integer firstNum = new Integer(11);
		Integer secondNum = new Integer(15);
		Double doubleNum1 = new Double(12);
		Double doubleNum2 = new Double(1234567890);
		String string1 = "35";

		System.out.println("Comparing two integers "+ firstNum + "\'" + " and \'" + secondNum + ". Result is " + anExample.demoCompareTo(firstNum, secondNum));
		System.out.println("Converting integer \'"+ firstNum + "\'" + " to double value" + ". Result is " + anExample.demoDoubleValue(firstNum));
		System.out.println("Result will be True if the integer \'" + firstNum + "\'" +
				" is equal to the integer \'"+ secondNum + "\'" + " Else False. The result is " + anExample.demoEquals(firstNum, secondNum));
		System.out.println("Converting integer \'"+ firstNum + "\'" + " to a string value" + ". Result is " + anExample.demoToString(firstNum));
		System.out.println("Converting double \'"+ secondNum + "\'" + " to a hashcode" + ". Result is " + anExample.demoHashCode(secondNum));
		System.out.println("Maximum value of an int can have is " + Integer.MAX_VALUE + ". Minimum value of an int can have is " + Integer.MIN_VALUE
				+ ". Their difference is " + anExample.demoMaxMinDifference());
		System.out.println("Size of the integer \'" + firstNum + "\'" + " is " + anExample.demoSize(firstNum));
		System.out.println("Parsed string argument " + "\"" + string1 + "\"" + " as a signed decimal integer is " + anExample.demoParseInt(string1));

	}
}
//
//
//
//
