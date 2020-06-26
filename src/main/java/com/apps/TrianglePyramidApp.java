package com.apps;

import com.samples.TrianglePyramidPrint;

public class TrianglePyramidApp{

	public static void main(String[] args) {
		
		TrianglePyramidPrint obj1 = new TrianglePyramidPrint();

		int shapeSize = 5;
		obj1.starTriangleByFor(shapeSize);

		System.out.println("");
		obj1.numTriangleByFor(shapeSize);

		System.out.println("");
		obj1.starPyramidByFor(shapeSize);

		System.out.println("");
		obj1.numPyramidByFor(shapeSize);

		System.out.println("");
		obj1.starTriangleByWhile(shapeSize);

		System.out.println("");
		obj1.numTriangleByWhile(shapeSize);

		System.out.println("");
		obj1.starPyramidByWhile(shapeSize);

		System.out.println("");
		obj1.numPyramidByWhile(shapeSize);
	}
}