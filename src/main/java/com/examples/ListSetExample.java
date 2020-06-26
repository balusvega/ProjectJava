package com.examples;

import com.sun.corba.se.impl.encoding.IDLJavaSerializationInputStream;

import java.util.*;

public class ListSetExample {

    public void demoAddString(List<String> userList) {
        //using add method to add values to an ArrayList
        userList.add("Alaa Neta");
        userList.add("Alab Netb");
        userList.add("Alac Netc");
        userList.add("Alad Netd");
        userList.add("Alae Nete");
        System.out.println("Initial list of users - " + userList);
    }

    public void demoPrintListStr(List<String> userList) {
        System.out.println("Printing userList using for loop String shortcut -");
        for (java.lang.String aString : userList) {
            System.out.println(aString);
        }
    }

    public void demoRemoveStr(List<String> userList) {
        userList.remove(2);
        System.out.println("userList after removing 3rd user in the list " + userList);

        userList.remove("Alae Nete");
        System.out.println("userList after removing the last user in the list " + userList);
        System.out.println("Size of the user list after above two removals is " + userList.size());
        System.out.println("Checking if userList is empty using isEmpty() method. Result is - " + userList.isEmpty());
        System.out.println("Checking if userList contains the user with first name \'Alad Netd\'. Result is - " + userList.contains("Alad Netd"));
    }

    public void demoAddStrAtIndex(int indexNum, List<String> userList) {
        userList.add(indexNum, "Alacc Netcc");
        System.out.println("UserList after adding an user at a specific index - " + userList);
    }

    public void demoClearStr(List<String> userList) {
        userList.clear();
        System.out.println("UserList after clearing - " + userList + "  and the size is - " + userList.size());
    }

    public void demoAddIntegerList1(List<Integer> idList) {
        // declaring an integer array list

        idList.add(10);
        idList.add(11);
        idList.add(12);
        idList.add(17);
        idList.add(18);
        System.out.println("First list of IDs - " + idList);
    }

    // use add() method to add elements in list2
    public void demoAddIntegerList2(List<Integer> idList2) {
        idList2.add(15);
        idList2.add(16);
        idList2.add(17);
        idList2.add(18);
        System.out.println("Second list of IDs - " + idList2);
    }

    public void demoPrintListInt(List<Integer> idList2) {
        System.out.println("Printing idList2 using for loop String shortcut -");
        for (Integer number : idList2)
            System.out.println(number);
    }

    public void demoAddAll(List<Integer> idList, List<Integer> idList2) {

        //inserting all elements of idList2 to idList
        idList.addAll(idList2);
        System.out.println("Full id list after adding idlist2 at the end of idlist - " + idList);

        //inserting all elements of idList2 to idList from index1
        idList.addAll(1, idList2);
        System.out.println("Full id list after adding idlist2 at index-1 of idlist - " + idList);

        System.out.println("idList before removing idList2 from it is - " + idList);
    }

    public void demoRemoveAll(List<Integer> idList, List<Integer> idList2) {
        idList.removeAll(idList2);
        System.out.println("idList after removing all numbers equal to idList2 numbers is - " + idList);
    }

    public void setAddString(Set<String> userSet) {
        userSet.add("User1");
        userSet.add("User2");
        userSet.add("User3");
        userSet.add("User4");
        System.out.println("Initial set of users - " + userSet);
    }

    public void setAgainString(String str, Set<String> userSet) {
        System.out.println("Current set of Users - " + userSet);
        userSet.add(str);
        System.out.println("Set do not allow duplicates. Hence existing user is not repeated/duplicated in this set " + userSet);
    }

    public void setContainsString(String str, Set<String> userSet) {
        System.out.println("True if \'" + str + "\' exists in the set, else false. Result is - " + userSet.contains(str));
    }

    public void demoHashCode(Set<String> userSet) {
        System.out.println("Hash code value of the user set\'" + userSet + "\' is " + userSet.hashCode());
    }

    public void demoCompareSets(Set<String> userSet1, Set<String> userSet2) {
        System.out.println("True if \'" + userSet1 + "\' is same as set2 \'" + userSet2 + "\', else false. Result is " + userSet1.equals(userSet2));
    }

    public void demoIterate(Set<String> userSet) {
        Iterator<String> stringIterator =  userSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println("The value is: " + stringIterator.next());
        }
    }


    //>>>>>>>>>>>>>>>>>>>>>CHeck this method
    /*public void demoIterateRemove(Set<String> userSet1, Set<String> userSet2) {
        Iterator<String> stringIterator1 =  userSet1.iterator();
        Iterator<String> stringIterator2 =  userSet2.iterator();

        if(stringIterator1.equals(stringIterator2)){
            stringIterator1.remove();
            while (stringIterator1.hasNext()) {
                System.out.println("The new set is " + stringIterator1.next());
            }
        }
    }*/
}




