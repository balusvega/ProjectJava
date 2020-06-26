package com.automobile;

import com.interfaces.Ride;

public class Bike extends Vehicle implements Ride{

	int noOfWheels=2;
	boolean hasSteering=false;

	//overriding showProperties() parent method
	public void showProperties(){
		System.out.println("Bike sounds vroom vroom");
		System.out.println("Bike has " + this.noOfWheels + " wheels");
		System.out.println("Does this bike has steering? "+ this.hasSteering);
	}

	public void ridable(){
		System.out.println("Bike is ridable");
	}

	public void needCommericalLicense(){
		System.out.println("Bike do not need commercial license");
	}

}