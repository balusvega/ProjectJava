package com.samples;


public class LoopExample{

	public void loopByFor(){
		// for(  initialization ; condition ; increment )
		for(int counter=0; counter<10;counter++){
			System.out.println(counter);
		}
	}

	public void loopByWhile(){
		// while(condition)
		int counter =0;
		while(counter<10){
			System.out.println(counter);
			counter++;
		}
	}
}