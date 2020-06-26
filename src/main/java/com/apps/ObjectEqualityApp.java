package com.apps;

import com.domain.Person;

public class ObjectEqualityApp {

    public static void main(String[] args) {

        Person aPerson = new Person();
        Person bPerson = new Person();
//
//        if(aPerson.equals(bPerson)){
//            System.out.println("They are equal");
//        }else{
//            System.out.println("They are not equal");
//        }

        aPerson.setFirstName("siva");
        aPerson.setLastName("reddy");
        aPerson.setCity("Cary");
        aPerson.setRole("PM");
        aPerson.setAge("30");

        bPerson.setFirstName("siva");
        bPerson.setLastName("reddy");
        bPerson.setCity("Cary");
        bPerson.setRole("PM");
        bPerson.setAge("30");

        if(aPerson.equals(bPerson)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal"+aPerson.hashCode()+" "+bPerson.hashCode());
        }

    }
}
