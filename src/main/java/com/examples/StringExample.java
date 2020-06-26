package com.examples;

public class StringExample{

	public int demoCompareTo(String firstString, String secondString){
		int returnInt = firstString.compareTo(secondString);
		return returnInt;
	}
	public String demoConcat(String firstString, String secondString){
		String returnString = firstString.concat(secondString);
		return returnString;
	}
	public char demoCharAt(String firstString, int charIndex){
		char returnChar = firstString.charAt(charIndex);
		return returnChar;
	}
	public int demoCompareToIgnoreCase(String firstString, String secondString){
		int returnString = firstString.compareToIgnoreCase(secondString);
		return returnString;
	}
	public boolean demoContains(String firstString, CharSequence charVar){
		boolean result = firstString.contains(charVar);
		return result;
	}
	public boolean demoEquals(String firstString, String secondString){
		boolean result = firstString.equals(secondString);
		return result;
	}
	public int demoLength(String firstString){
		int result = firstString.length();
		return result;
	}
	public boolean demoIsEmpty(String firstString){
		boolean result = firstString.isEmpty();
		return result;
	}
	public String demoReplace(String firstString, char Var1, char Var2){
		String result = firstString.replace(Var1, Var2);
		return result;
	}
	public String demoToUpperCase(String firstString){
		String result = firstString.toUpperCase();
		return result;
	}
	public String demoToLowerCase(String firstString){
		String result = firstString.toLowerCase();
		return result;
	}
	public String demoTrim(String firstString){
		String result = firstString.trim();
		return result;
	}
}