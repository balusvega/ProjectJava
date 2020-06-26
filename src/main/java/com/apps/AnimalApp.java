package com.apps;

import com.beings.*;
import com.interfaces.Pet;

public class AnimalApp{

	public static void main(String[] args) {

		// Animal anAnimal = new Animal(); --- abstract
		Animal anAnimal;

		// int noOfLegInApp = anAnimal.noOfLegs;
		// System.out.println("The no of legs in app: "+noOfLegInApp);
		// anAnimal.showProperties();

		// Dog aDog = new Dog();
		anAnimal = new Dog();
		// System.out.println("The no of legs in app: "+aDog.noOfLegs);
		anAnimal.showProperties();
		anAnimal.says();

		// Cat aCat = new Cat();
		anAnimal = new Cat();
		// System.out.println("The no of legs in app: "+aCat.noOfLegs);
		anAnimal.showProperties();
		anAnimal.says();

		// Human aHuman = new Human();
		anAnimal = new Human();
		anAnimal.showProperties();
		anAnimal.says();

		Pet aPet = new Dog();
		aPet.petable();
		aPet.isCute();
		// aPet.showProperties(); --- cannot do

		aPet = new Cow();
		aPet.petable();
		aPet.isCute();
	}
}