package com.examples;

public class WrapperExample{

	//integer wrapper
	public int demoCompareTo(Integer firstInt, Integer secondInt){
		int returnInt = firstInt.compareTo(secondInt);
		return returnInt;
	}
	public double demoDoubleValue(Integer firstInt){
		double returnDouble = firstInt.doubleValue();
		return returnDouble;
	}
	public boolean demoEquals(Integer firstInt, Integer secondInt){
		boolean result = firstInt.equals(secondInt);
		return result;
	}
	public String demoToString(Integer firstInt){
		String result = firstInt.toString();
		return result;
	}

	//Double wrapper
	public int demoHashCode(Integer firstInt){
		int result = firstInt.hashCode();
		return result;
	}

	// max and min difference
	public int demoMaxMinDifference (){
		int result = Integer.MAX_VALUE - Integer.MIN_VALUE;
		return result;
	}

	public int demoSize (Integer firstInt){
		int result = firstInt.SIZE;
		return result;
	}

	public int demoParseInt (String firstString) throws NumberFormatException {
		int result = Integer.parseInt(firstString);
		return result;
	}

/*	public int demoIntValue(double firstDouble){
		int result;
		result = firstDouble.intValue();
		return result;
	}*/
}