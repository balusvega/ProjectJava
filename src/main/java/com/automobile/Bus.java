package com.automobile;

import com.interfaces.Ride;

public class Bus extends Vehicle implements Ride{

	
	int noOfWheels=4;
	boolean hasSteering=true;

	//overriding showProperties() parent method
	public void showProperties(){
		System.out.println("Bus sounds Beep");
		System.out.println("Bus has " + this.noOfWheels + " wheels");
		System.out.println("Does this Bus has steering? "+ this.hasSteering);
	}

	public void ridable(){
		System.out.println("Bus is ridable");
	}

	public void needCommericalLicense(){
		System.out.println("Bus need commercial license");
	}

}