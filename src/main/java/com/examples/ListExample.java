package com.examples;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    List<String> stringList = new ArrayList<String>();

    List<Integer> integerList;


    public void demoAdd(){
        System.out.println("The size of the stringList: "+stringList.size());
        stringList.add("john");
        stringList.add("mark");
        stringList.add("lisa");
        stringList.add("john");
        System.out.println("The size of the stringList: "+stringList.size());
    }

    public void demoIterate(){

        // iterator method
        Iterator<String> stringIterator =  stringList.iterator();

        while(stringIterator.hasNext()){
            System.out.println("The value is: "+stringIterator.next());
        }

        // for shorcut
        for (String aString : stringList){
            System.out.println("The value in for loop: "+ aString);
        }

        for(int i=0; i<stringList.size();i++){
            System.out.println("The value in regular for loop is:"+stringList.get(i));
        }

    }
}
