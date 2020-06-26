package com.beings;

public class Human extends Animal{

	int noOfLegs = 2;
	boolean hasTail = false;

	public void showProperties(){
		System.out.println("Human has "+this.noOfLegs+" legs");
		System.out.println("But an  animal has "+super.noOfLegs+" legs");
		System.out.println("Does Human has tail? "+this.hasTail);
		System.out.println("Does this animal has tail? "+super.hasTail);
	}

		public void says(){
		System.out.println("Hi");
	}
}