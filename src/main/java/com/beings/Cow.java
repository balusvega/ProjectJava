package com.beings;

import com.interfaces.Pet;

public class Cow extends Animal implements Pet {
	// Cow class is not implementing interface Pet but extending parent class Animal	
	public void says(){
	System.out.println("Cow says Umbaa");
	}

	public void petable(){
	System.out.println("I'm not petable");
	}

	public void isCute(){
	System.out.println("I'm cute");
	}
}