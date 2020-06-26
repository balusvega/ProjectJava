package com.samples;


public class TrianglePyramidPrint{

	public void starTriangleByFor(int triangleSize){
		System.out.println("Star triangle of size "+ triangleSize + " is printed below");

		for(int counter=1 ; counter <= triangleSize ; counter++){
			System.out.println("");
			for(int subCount=1 ; subCount <= counter ; subCount++){
				System.out.print("*" + " ");
			}
		}
	}

	public void numTriangleByFor(int triangleSize){
		System.out.println("Number triangle of size "+ triangleSize + " is printed below");

		for(int counter=1 ; counter <= triangleSize ; counter++){
			System.out.println("");
			for(int subCount=1 ; subCount <= counter ; subCount++){
				System.out.print(subCount + " ");
			}
		}
	}

	public void starPyramidByFor(int pyramidSize){
		System.out.println("Star pyramid of size "+ pyramidSize + " is printed below");

		for(int counter=1 ; counter <= pyramidSize ; counter++){
			System.out.println("");

			for(int subCount=1 ; subCount <= (pyramidSize-counter) ; subCount++){
				System.out.print(" ");
			}

			for(int nmCount=1 ; nmCount <= counter ; nmCount++){
				System.out.print("*" + " ");
			}
		}	
	}

	public void numPyramidByFor(int pyramidSize){
		System.out.println("Star pyramid of size "+ pyramidSize + " is printed below");

		for(int counter=1 ; counter <= pyramidSize ; counter++){
			System.out.println("");

			for(int subCount=1 ; subCount <= (pyramidSize-counter) ; subCount++){
				System.out.print(" ");
			}

			for(int nmCount=1 ; nmCount <= counter ; nmCount++){
				System.out.print(nmCount + " ");
			}
		}	
	}

	public void starTriangleByWhile(int triangleSize){
		System.out.println("Star triangle of size "+ triangleSize + " is generated as below using while loop");
		int counter = 1;
		while(counter <= triangleSize){
			System.out.println("");
			int subCounter = 1;
			while(subCounter <= counter){
				System.out.print("*" + " ");
				subCounter++;
			}
			counter++;
		}
	}
		 
	public void numTriangleByWhile(int triangleSize){
		System.out.println("Number triangle of size "+ triangleSize + " is generated as below using while loop");
		int counter =1;
		while(counter<=triangleSize){
			System.out.println("");
			int subCounter = 1;
			while(subCounter<=counter){
				System.out.print(subCounter + " ");
				subCounter++;
			}
			counter++;
		}
	}

	public void starPyramidByWhile(int pyramidSize){
		System.out.println("Star pyramid of size "+ pyramidSize + " is generated as below using while loop");
		int counter =1;
		while(counter<=pyramidSize){
			System.out.println("");
			int subCounter = 1;
			while(subCounter<=(pyramidSize-counter)){
				System.out.print(" ");
				subCounter++;
			}
				int nmCount = 1;
				while(nmCount<=counter){
					System.out.print("*" + " ");
					nmCount++;
				}
			counter++;
		}
	}

	public void numPyramidByWhile(int pyramidSize){
		System.out.println("Number pyramid of size "+ pyramidSize + " is generated as below using while loop");
		int counter =1;
		while(counter<=pyramidSize){
			System.out.println("");
			int subCounter = 1;
			while(subCounter<=(pyramidSize-counter)){
				System.out.print(" ");
				subCounter++;
			}
				int nmCount = 1;
				while(nmCount<=counter){
					System.out.print(nmCount + " ");
					nmCount++;
				}
			counter++;
		}
	}
}