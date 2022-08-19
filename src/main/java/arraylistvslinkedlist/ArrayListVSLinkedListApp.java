package main.java.arraylistvslinkedlist;


import main.java.arraylistvslinkedlist.file.ArrayListChecker;
import main.java.arraylistvslinkedlist.file.LinkedListChecker;

public class ArrayListVSLinkedListApp {
    public static void main(String[] args) {
        ArrayListChecker myArrayList = new ArrayListChecker();
        LinkedListChecker myLinkedList = new LinkedListChecker();

        long startTime = System.currentTimeMillis();
        myArrayList.randomArrayList(1_000_000);
//        myArrayList.removeTheFirstElement();
        myArrayList.removeMiddleElement();
//        myArrayList.removeTheLastElement();

        long endTime = System.currentTimeMillis();
        System.out.println("The ArrayList methods execution time is: " + (endTime - startTime) + "ms");

        long startTime1 = System.currentTimeMillis();
        myLinkedList.randomLinkedList(1_000_000);
//        myLinkedList.removeTheFirstElement();
        myLinkedList.removeMiddleElement();
//        myLinkedList.removeTheLastElement();

        long endTime1 = System.currentTimeMillis();
        System.out.println("The LinkedList methods execution time: " + (endTime1 - startTime1) + "ms");
    }
}

