package training.core.collections.list;

import java.util.*;

public class ListExamples {

    static List<Integer> integerLinkedList;
    static List<Integer> integerArrayList;

    public static void main(String[] args) {

        integerLinkedList = new LinkedList<>();
        integerArrayList = new ArrayList<>();

        Date startTime;
        Date endTime;

        System.out.println("Linked list test");
        startTime = new Date();
        for(long i = 0; i < 100_000; i++)  {
            integerLinkedList.add( 10);  // (0,10)
        }

        endTime = new Date();
        long runTime = endTime.getTime() - startTime.getTime();
        System.out.println("Linked list test:" + runTime);

 //**************************************************//

        System.out.println("Array list test");
        startTime = new Date();
        for(long i = 0; i < 100_000; i++)  {
            integerArrayList.add( 10); // (0,10)
        }

        endTime = new Date();
        runTime = endTime.getTime() - startTime.getTime();
        System.out.println("Array list test:" + runTime);

        // migrate from array list
        Arrays.asList(integerArrayList);
        // migration from list to array
        integerLinkedList.toArray();


        integerLinkedList = new LinkedList<>();
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(36);
        integerLinkedList.add(-3);

        for (Integer el : integerLinkedList){
            System.out.println(el);
        }

        Collections.sort(integerLinkedList);
        for (Integer el : integerLinkedList) {
            System.out.println(el);
        }
//**************************************************//

        integerLinkedList = new LinkedList<Integer>(){{
            add(7);
            add(-9);
            add(0);
        }};

        Collections.reverse(integerLinkedList);
        for (Integer el : integerLinkedList) {
            System.out.println(el);
        }



    }

}
