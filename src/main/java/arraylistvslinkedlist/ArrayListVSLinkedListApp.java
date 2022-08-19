package main.java.arraylistvslinkedlist;


import main.java.arraylistvslinkedlist.file.ArrayListChecker;
import main.java.arraylistvslinkedlist.file.LinkedListChecker;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedListApp {

    public static void main(String[] args) {
        ArrayListChecker myArrayList = new ArrayListChecker();
        LinkedListChecker myLinkedList = new LinkedListChecker();

        myLinkedList.checkRemoving(1_000_000, 0);
        myLinkedList.checkRemoving(10_000, 0);
        myLinkedList.checkRemoving(1_000, 0);

        myLinkedList.checkRemoving(10_000_000, 0);
        myArrayList.checkRemoving(10_000_000, 0);





    }
}

