package day53_Collection;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {
        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,12,9,8,7,5,6,3,2,1));
        System.out.println("arrayDeque = " + arrayDeque);
        arrayDeque.poll(); //10
        arrayDeque.poll(); //12
        System.out.println("arrayDeque = " + arrayDeque);

        int num1 = (Integer)((ArrayDeque)arrayDeque).getFirst(); //(Integer)Object
        System.out.println(((ArrayDeque)arrayDeque).getFirst());

        System.out.println(((ArrayDeque)arrayDeque).getLast());

        System.out.println("====================================");

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,12,9,8,7,5,6,3,2,1));
        System.out.println("LinkedList = " + linkedList);
        linkedList.poll(); //10
        linkedList.poll(); //12
        System.out.println("LinkedList = " + linkedList);

        System.out.println(((LinkedList<Integer>)linkedList).get(0));
        System.out.println(((LinkedList<Integer>)linkedList).get(linkedList.size()-1));

        System.out.println(((LinkedList<Integer>)linkedList).getFirst());
        System.out.println(((LinkedList<Integer>)linkedList).getLast());
        //if i font want to cast it to linkedList everytime, just change the xQueue to linkedList.

        linkedList.add(null);
        System.out.println("linkedList = " + linkedList);


        System.out.println("====================================");

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,12,9,8,7,5,6,3,2,1));

        System.out.println("priorityQueue = " + priorityQueue);
        priorityQueue.poll();
        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);
        //no point of using getFirst and getLast;







    }
}
