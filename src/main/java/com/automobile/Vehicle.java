package com.automobile;

abstract public class Vehicle{

	protected int noOfWheels=4;
	protected boolean hasSteering=true;

	public void showProperties(){
		System.out.println("This vehicle has "+noOfWheels+" wheels");
		System.out.println("Does this vehicle has steering? "+hasSteering);
	}
}