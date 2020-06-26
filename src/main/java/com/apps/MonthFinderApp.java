package com.apps;

import com.samples.MonthFinder;
import com.exceptions.NotAValidMonthException;

public class MonthFinderApp{

	public static void main(String[] args) {
		MonthFinder aMonthFinder = new MonthFinder();

		int monthVar=1;
		System.out.println("First string is from if else chain and second is from switch case chain");
		String monthName;

		// for (monthVar = 1; monthVar <= 12; monthVar++) {
		try{
			 monthName = aMonthFinder.findMonth(monthVar);
			System.out.println("The monthName is :"+ monthName);
		}catch(NotAValidMonthException exp){
			// System.out.println("The number you entered is invalid");
			System.out.println("Please enter a valid month number");
			// aMonthFinder.findMonthBySwitch(monthVar);
		}
		// }
		try{
			monthName = aMonthFinder.findMonth(16);
			System.out.println("The monthName is :"+ monthName);
		}catch(NotAValidMonthException exp){
			// System.out.println("The number you entered is invalid");
			System.out.println("Please enter a valid month number");
			// aMonthFinder.findMonthBySwitch(monthVar);
		}
			// aMonthFinder.findMonthBySwitch(-1);
	}
}