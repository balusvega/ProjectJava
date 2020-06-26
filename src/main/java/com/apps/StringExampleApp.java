package com.apps;

import com.examples.StringExample;
public class StringExampleApp{

	public static void main(String[] args) {
		
		StringExample anExample = new StringExample();

		String firstString = new String("StringOne");		
		String secondString = " StringTwo";
		String thirdString = "Notempty";
		String fourthString = "score";
		String fifthString = "uppercasing";
		String sixthString = "LOWERCASING";
		String seventhString = "      This statement is now trimmed      ";
		int charIndex = 3;
		CharSequence charSeq = "A";
		char replaceString = 't';

		// comparing two string lexicographically
		int result = anExample.demoCompareTo(firstString, secondString);
		System.out.println("Result after lexicographically comparing \'"+ firstString + "\'" + " and \'" + secondString + "\'" + " is " + result);

		// concatenating two strings
		System.out.println("The value of concat: " + anExample.demoConcat(firstString, secondString));	

		// char value at specific index
		System.out.println("The char value at index " + charIndex + " for the string \'" + firstString + "\' is \'" + anExample.demoCharAt(firstString, charIndex) + "\'");

		// Comparing two strings lexicographically, ignoring case differences.
		System.out.println("Result after lexicographically comparing \'"+ firstString + "\'" + " and \'" + secondString + "\'" + " ignoring the case is " + anExample.demoCompareToIgnoreCase(firstString, secondString));

		// method Contains returns true if and only if this string contains the specified sequence of char values
		System.out.println("Result will be True if the string \'" + secondString + "\'" + " contains the char \'"+ charSeq + "\'" + " Else False. The result is " + anExample.demoContains(secondString, charSeq));

		//Comparing a string to the specified object
		System.out.println("Result will be True if the string \'" + secondString + "\'" + " is equal to the string \'"+ firstString + "\'" + " Else False. The result is " + anExample.demoEquals(firstString, secondString));

		// Returns the length of this string
		System.out.println("Length of the string \'"+ firstString + "\'" + " is " + anExample.demoLength(firstString));

		//Method Returns true if, and only if, length() is 0 for the string
		System.out.println("Result will be True if the string \'" + thirdString + "\'" + " length is zero."+ " And the result is " + anExample.demoIsEmpty(thirdString));

		// Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		System.out.println("Final value of the string \'" + fourthString + "\'" + " after replacing all \'c\' characters"+ " with \'" + replaceString + "\' is \'" + anExample.demoReplace(fourthString, 'c', replaceString) + "\'");

		// Converts all of the characters in this String to upper case using the rules of the default locale.
		System.out.println("Converting the string \'" + fifthString + "\'" + " to uppercase using toUppercase() method."+ " The result is \'" + anExample.demoToUpperCase(fifthString) + "\'");

		// Converts all of the characters in this String to lower case using the rules of the default locale.
		System.out.println("Converting the string \'" + sixthString + "\'" + " to lowercase using toLowercase() method."+ " The result is \'" + anExample.demoToLowerCase(sixthString) + "\'");

		// trimming a string. trim() Returns a string whose value is this string, with any leading and trailing whitespace removed.
		System.out.println("Trimming the string \'" + seventhString + "\'" + " to remove leading and trailing whitespace using trim() method."+ " The result is \'" + anExample.demoTrim(seventhString) + "\'");
	}
}