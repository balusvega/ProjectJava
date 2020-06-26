package com.automobile;

import com.interfaces.Ride;

public class Car extends Vehicle implements Ride{

	
	int noOfWheels=4;
	boolean hasSteering=true;

	//overriding showProperties() parent method
	public void showProperties(){
		System.out.println("Car sounds Kee Keee");
		System.out.println("Car has " + this.noOfWheels + " wheels");
		System.out.println("Does this car has steering? "+ this.hasSteering);
	}

	public void ridable(){
		System.out.println("Car is ridable");
	}

	public void needCommericalLicense(){
		System.out.println("Car do not need commercial license");
	}

}