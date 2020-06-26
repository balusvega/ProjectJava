package com.beings;

abstract public class Animal{

	protected int noOfLegs=4;
	protected boolean hasTail=true;

	public void showProperties(){
		System.out.println("This animal has "+noOfLegs+" legs");
		System.out.println("Does this animal has tail? "+hasTail);
	}

	abstract public void says();

}