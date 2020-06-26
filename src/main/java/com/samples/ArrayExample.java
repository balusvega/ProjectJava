package com.samples;

import com.exceptions.NotFoundException;

public class ArrayExample {

    public static String [] userList = new String[] {"john", "nemoly", "reddy", "virat", "Lopez", "Gavet", "gasse", "niki", "melen",  "vots", "HASET",  "Kals"};
    int[] userID = new int [] { 11, -2, 23, 4, 5, 6, 7, 8, 2, 3, 24, -1};
    //int[] userID = new int [] { 11, 2, 23, 4, 5, 6, 7, 8, 2, 3, 24, -1, 25};

    public int findName(String randomName) throws NotFoundException {
        int result = -1;

//        System.out.println("Number of users currently listed is " + userList.length);

        for (int counter = 0; counter < userList.length; counter++) {
            if (userList[counter].equalsIgnoreCase(randomName)) {
                result = counter;
                break;
            }
        }
        if(result==-1)
            throw new NotFoundException();
        return result;
    }

    public int maxNumber() {
        int compareInt = userID[0];
        for (int counter = 0; counter < (userList.length - 1); counter++)
            if (userID[counter] < userID[counter + 1] && userID[counter+1] > compareInt ) {
                compareInt = userID[counter + 1];
            }
        return compareInt;
    }

    public int minNumber() {
        int compareInt = userID[0];
        for (int counter = 0; counter < (userList.length - 1); counter++)
            if (userID[counter] > userID[counter + 1] && userID[counter+1] < compareInt ) {
                compareInt = userID[counter + 1];
            }
        return compareInt;
    }
}