package Collections;

import java.util.PriorityQueue;

public class Queue {

    public static void add (PriorityQueue<String> myPriorityQueue, int number) {

        for (int i = 0; i < number; i++) {
            myPriorityQueue.add("Sos");

        }

    }

    public static void main(String[] args) {


        PriorityQueue<String> myPriorityQueue = new PriorityQueue<>();

        add(myPriorityQueue,100000);
        myPriorityQueue.add("dod");
        myPriorityQueue.remove(0);


        for(String i: myPriorityQueue)
            System.out.println(i);

//        myPriorityQueue.remove();
//        System.out.println("After removing:");
//        for(int i: myPriorityQueue)
//            System.out.println(i);
    }


}
