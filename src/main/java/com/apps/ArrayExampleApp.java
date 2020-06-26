package com.apps;

import com.exceptions.NotFoundException;
import com.samples.ArrayExample;

public class ArrayExampleApp {

    public static void main(String[] args) {

        ArrayExample aNameArray = new ArrayExample();
        String result;
        // TC:1 - Validate if name does not exist
        result = ArrayExampleApp.testFindName(aNameArray, "Tera");
        if(result.equals("EXCEPTION"))
            System.out.println("Test case not found is PASSED");
        else
            System.out.println("Test case not found is FAILED");

        result = ArrayExampleApp.testFindName(aNameArray, "reddy");
        if(result.equals("2"))
            System.out.println("Test case exact match is PASSED");
        else
            System.out.println("Test case exact match is FAILED");

        result = ArrayExampleApp.testFindName(aNameArray, "REDDY");
        if(result.equals("2"))
            System.out.println("Test case not exact match is PASSED");
        else
            System.out.println("Test case not exact match is FAILED");

        System.out.println("");
        System.out.println("Maximum number in the integer array is " + aNameArray.maxNumber());
        System.out.println("Minimum number in the integer array is " + aNameArray.minNumber());

    }

    private static  String testFindName(ArrayExample aNameArray, String stringToBeFound){
        String result;
        try {

            int returnResult = aNameArray.findName(stringToBeFound);
//            System.out.println("Provided name: "+stringToBeFound+" is present at index: "+returnResult+ " in the list");
            result = new Integer(returnResult).toString();

        } catch (NotFoundException exp) {
//            System.out.println("Provided name: "+stringToBeFound+" is not present in the list. Please counter check");
            result = "EXCEPTION";
        }
        return result;
    }
}
