package com.beings;

import com.interfaces.Pet;

public class Dog extends Animal implements Pet{

	public static String GENUS = "Canine";

	public void says(){
		System.out.println("woof!woof!");
	}

	public void petable(){
		System.out.println("I'm petable");
	}

		public void isCute(){
		System.out.println("I'm cute");
	}

}