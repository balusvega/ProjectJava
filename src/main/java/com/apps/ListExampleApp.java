package com.apps;

import com.examples.ListExample;
import com.examples.ListSetExample;

import java.util.*;

public class ListExampleApp {

    public static void main(String[] args) {

        List<java.lang.String> userList = new ArrayList<>();
        List<Integer> idList = new LinkedList<Integer>();
        List<Integer> idList2 = new ArrayList<Integer>();
        Set<String> userSet1 = new HashSet<String>();
        Set<String> userSet2 = new HashSet<String>();


        ListSetExample anExample1 = new ListSetExample();

/*        anExample1.demoAddString(userList);
        anExample1.demoPrintListStr(userList);
        anExample1.demoRemoveStr(userList);
        anExample1.demoAddStrAtIndex(2, userList);
        anExample1.demoClearStr(userList);
        anExample1.demoAddIntegerList1(idList);
        anExample1.demoAddIntegerList2(idList2);
        anExample1.demoPrintListInt(idList2);
        anExample1.demoAddAll(idList, idList2);
        anExample1.demoRemoveAll(idList, idList2);*/

        anExample1.setAddString(userSet1);
        anExample1.setAgainString("User1", userSet1);
        anExample1.setContainsString("User3", userSet1);
        anExample1.demoHashCode(userSet1);
        anExample1.setAddString(userSet2);
        anExample1.demoHashCode(userSet2);
        anExample1.demoCompareSets(userSet1, userSet2);
        anExample1.setAddString(userSet1);
        anExample1.demoIterate(userSet1);
        //CHeck this method -        anExample1.demoIterateRemove(userSet2, userSet1);





/*
    //ListExample anExample = new ListExample();
        anExample.demoAdd();

        anExample.demoIterate();
*/
    }


}
