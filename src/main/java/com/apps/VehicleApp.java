package com.apps;

import com.automobile.*;
import com.interfaces.Ride;

public class VehicleApp{

	public static void main(String[] args) {
		Vehicle aVehicle;
		//creating bike object using Bike Class
		aVehicle = new Bike();
		aVehicle.showProperties();

		Ride aRide = new Bike();
		aRide.ridable();
		aRide.needCommericalLicense();
		//creating car object using Bike Class
		aVehicle = new Car();
		aVehicle.showProperties();

		aRide = new Car();
		aRide.ridable();
		aRide.needCommericalLicense();

		//creating bike object using Bike Class
		aVehicle = new Bus();
		aVehicle.showProperties();

		aRide = new Bus();
		aRide.ridable();
		aRide.needCommericalLicense();
	}
}